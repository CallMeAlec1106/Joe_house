package com.engineering.bookpurchase.order.controller;

import com.engineering.bookpurchase.buycar.pojo.BookBuycar;
import com.engineering.bookpurchase.buycar.service.BuycarService;
import com.engineering.bookpurchase.common.utils.LayuiTableResultUtil;
import com.engineering.bookpurchase.front.pojo.User;
import com.engineering.bookpurchase.order.pojo.BookOrder;
import com.engineering.bookpurchase.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private BuycarService buycarService;

    @RequestMapping("addOrder")
    @ResponseBody
    public int addOrder(@RequestParam("price") String price, @RequestParam("booid") Integer booid, @RequestParam("num") String num,
                        @RequestParam("totalPrice") String totalPrice, @RequestParam("buycarId") Integer buycarId, HttpSession session){
        User userCheck =(User) session.getAttribute("user");
        Integer consumerid = userCheck.getConsumerid();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        BookOrder bookOrder = new BookOrder();
        bookOrder.setBookId(booid);
        bookOrder.setPrice(price);
        bookOrder.setOrderQuantity(num);
        bookOrder.setTotalPrice(totalPrice);
        bookOrder.setUserId(consumerid);
        bookOrder.setCreateDate(formatter.format(new Date()));
        int number = orderService.insert(bookOrder);
        if(number>0){
            BookBuycar bookBuycar = new BookBuycar();
            bookBuycar.setBuycarId(buycarId);
            number = buycarService.updateBuycarStatue(bookBuycar);
        }
        return number;
    }

    @RequestMapping("orderList")
    public String orderList(){
        return "order/order-list";
    }

    @RequestMapping("orderListData")
    @ResponseBody
    public LayuiTableResultUtil<List> orderListData(@RequestParam("limit") Integer limit, @RequestParam("page") Integer page){
        List<BookOrder> bookDetails = orderService.selectByExample((page - 1) * limit, limit);
        int number = orderService.selectOrderCount();
        LayuiTableResultUtil<List> layuiTableResultUtil = new LayuiTableResultUtil<>("", bookDetails, 0, number);
        return layuiTableResultUtil;
    }

    @RequestMapping("/deleteOrder")
    @ResponseBody
    public Integer deleteOrder(@RequestParam("orderId") Integer orderId){
        int number = orderService.deleteByPrimaryKey(orderId);
        return number;
    }

    @PostMapping("/deleteSelectTypeId/{orderId}")
    @ResponseBody
    public boolean deleteSelectTypeId(@PathVariable("orderId") String orderId){
        List delList = new ArrayList();
        String[] strs = orderId.split(",");
        for (String str : strs) {
            delList.add(str);
        }
        System.out.println(delList);
        boolean flg = orderService.deleteSelectByPrimaryKey(delList);
        return flg;
    }

    @PostMapping("/searchByBook")
    @ResponseBody
    public LayuiTableResultUtil<List> searchByBook(@RequestParam("bookname") String bookname,@RequestParam("author") String author){
        /*List<BookOrder> bookDetails = orderService.searchByOrder(bookname,author);
        int number = orderService.searchByOrderCount();
        LayuiTableResultUtil<List> layuiTableResultUtil = new LayuiTableResultUtil<>("", bookDetails, 0, number);
        return layuiTableResultUtil;*/
        return null;
    }

}