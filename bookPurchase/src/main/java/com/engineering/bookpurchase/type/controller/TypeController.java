package com.engineering.bookpurchase.type.controller;

import com.engineering.bookpurchase.common.utils.LayuiTableResultUtil;
import com.engineering.bookpurchase.type.pojo.BookType;
import com.engineering.bookpurchase.type.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/type")
public class TypeController {
    
    @Autowired
    private TypeService typeService;

    @RequestMapping("/typeList")
    public String typeList(){
        return "type/type-list";
    }

    @RequestMapping("/typeListData")
    @ResponseBody
    public LayuiTableResultUtil<List> typeListData(@RequestParam("limit") Integer limit,@RequestParam("page") Integer page){
        List<BookType> bookTypes = typeService.selectByExample((page - 1) * limit, limit);
        int number = typeService.selectTypeCount();

        LayuiTableResultUtil<List> layuiTableResultUtil = new LayuiTableResultUtil<>("", bookTypes, 0, number);

        return layuiTableResultUtil;
    }

    @RequestMapping("/typeAdd")
    public String tyepAdd(){
        return "type/type-add";
    }
    
    @RequestMapping("/typeAddSave")
    @ResponseBody
    public Integer typeAddSave(@RequestParam("typeName") String typeName){
        BookType bookType = new BookType();
        bookType.setTypename(typeName);
        Date data = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String creatData=formatter.format(data);
        bookType.setCreateData(creatData);
        int number = typeService.insertType(bookType);
        return number;
    }

    @RequestMapping("/typeEdit/{typeID}")
    public String typeEdit(@PathVariable("typeID") Integer typeID, Model model){
        BookType bookType = typeService.selectByPrimaryKey(typeID);
        model.addAttribute("bookType",bookType);
        return "type/type-add";
    }

    @RequestMapping("/typeEdit/saveTypeEdit")
    @ResponseBody
    public Integer saveTypeEdit(BookType bookType){
        Date data = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String updataData=formatter.format(data);
        bookType.setUpdataData(updataData);
        int number = typeService.updateByPrimaryKeySelective(bookType);
        return number;
    }

    @RequestMapping("/deleteType")
    @ResponseBody
    public Integer deleteType(@RequestParam("typeID") Integer typeID){
        int number = typeService.deleteByPrimaryKey(typeID);
        return number;
    }

    @PostMapping("/deleteSelectTypeId/{typeid}")
    @ResponseBody
    public boolean deleteSelectTypeId(@PathVariable("typeid") String typeid){
        List delList = new ArrayList();
        String[] strs = typeid.split(",");
        for (String str : strs) {
            delList.add(str);
        }
        System.out.println(delList);
        boolean flg = typeService.deleteSelectByPrimaryKey(delList);
        return flg;
    }

    @PostMapping("/searchByType")
    @ResponseBody
    public LayuiTableResultUtil<List> searchByType(@RequestParam("booktype") String booktype){
        List<BookType> bookTypes = typeService.searchByType(booktype);
        int number = typeService.searchByTypeCount();
        LayuiTableResultUtil<List> layuiTableResultUtil = new LayuiTableResultUtil<>("", bookTypes, 0, number);
        return layuiTableResultUtil;
    }

}