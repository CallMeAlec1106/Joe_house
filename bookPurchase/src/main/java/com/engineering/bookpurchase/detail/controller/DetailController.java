package com.engineering.bookpurchase.detail.controller;

import com.engineering.bookpurchase.common.utils.LayuiTableResultUtil;
import com.engineering.bookpurchase.detail.pojo.BookDetail;
import com.engineering.bookpurchase.detail.service.DetailService;
import com.engineering.bookpurchase.type.pojo.BookType;
import com.engineering.bookpurchase.type.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/detail")
public class DetailController {

    @Autowired
    private DetailService detailService;
    @Autowired
    private TypeService typeService;

    @RequestMapping("/detailList")
    public String detailList(){
        return "detail/detail-list";
    }

    @RequestMapping("/detailListData")
    @ResponseBody
    public LayuiTableResultUtil<List> typeListData(@RequestParam("limit") Integer limit, @RequestParam("page") Integer page){
        List<BookDetail> bookDetails = detailService.selectByExample((page - 1) * limit, limit);
        int number = detailService.selectDetailCount();
        LayuiTableResultUtil<List> layuiTableResultUtil = new LayuiTableResultUtil<>("", bookDetails, 0, number);
        return layuiTableResultUtil;
    }

    @RequestMapping("addDetail")
    public String addDetail(Model model){
        List<BookType> bookTypes = typeService.selectType();
        model.addAttribute("bookTypes",bookTypes);
        return "detail/detail-add";
    }

    @ResponseBody
    @PostMapping("/addDetailSave")
    public Integer addDetailSave(BookDetail bookDetail){
        int number = detailService.insert(bookDetail);
        return number;
    }

    @RequestMapping("/detailEdit/{bookid}")
    public String detailEdit(@PathVariable("bookid") Integer bookid, Model model){
        BookDetail bookDetail = detailService.selectByPrimaryKey(bookid);
        List<BookType> bookTypes = typeService.selectType();
        model.addAttribute("bookTypes",bookTypes);
        model.addAttribute("bookDetail",bookDetail);
        return "detail/detail-edit";
    }

    @ResponseBody
    @RequestMapping("/detailEdit/detailEditSave")
    public Integer detailEditSave(BookDetail bookDetail){
        int number = detailService.updateByPrimaryKey(bookDetail);
        return number;
    }

    @RequestMapping("/deleteDetail")
    @ResponseBody
    public Integer deleteDetail(@RequestParam("bookid") Integer bookid){
        int number = detailService.deleteByPrimaryKey(bookid);
        return number;
    }

    @PostMapping("/deleteSelectBookId/{bookid}")
    @ResponseBody
    public boolean deleteSelectTypeId(@PathVariable("bookid") String bookid){
        List delList = new ArrayList();
        String[] strs = bookid.split(",");
        for (String str : strs) {
            delList.add(str);
        }
        System.out.println(delList);
        boolean flg = detailService.deleteSelectByPrimaryKey(delList);
        return flg;
    }

    @PostMapping("/searchByBook")
    @ResponseBody
    public LayuiTableResultUtil<List> searchByBook(@RequestParam("bookname") String bookname,@RequestParam("author") String author){
        List<BookDetail> bookDetails = detailService.searchByBook(bookname,author);
        int number = detailService.searchByBookCount();
        LayuiTableResultUtil<List> layuiTableResultUtil = new LayuiTableResultUtil<>("", bookDetails, 0, number);
        return layuiTableResultUtil;
    }

    @RequestMapping("/selectDetailByBookId")
    @ResponseBody
    public BookDetail selectDetailByBookId (@RequestParam("bookid") Integer bookid,Model model){
        System.out.println(" 书的id： "+bookid);
        BookDetail bookDetail = detailService.selectDetailByBookId(bookid);
        System.out.println(" 书的类型名： "+bookDetail.getBookType());
        if(bookDetail != null){
            System.out.println(bookDetail);
            return  bookDetail;
        }else{
            return  null;
        }

    }

}