package com.engineering.bookpurchase.front.controller;

import com.engineering.bookpurchase.detail.pojo.BookDetail;
import com.engineering.bookpurchase.detail.service.DetailService;
import com.engineering.bookpurchase.front.pojo.User;
import com.engineering.bookpurchase.front.service.FrontService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;


@Controller
@RequestMapping("/user_front")
public class FrontController {

    @Autowired
    private FrontService frontService;
    @Autowired
    private DetailService detailService;

    @RequestMapping("register")
    public String register() {
        System.out.println("进入注册用户页面");
        return "front/front_register";
    }

    @RequestMapping("registerUser")
    @ResponseBody
    public int registerUser(User user) {
        int i = frontService.registerUser(user);
        if (i > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    @RequestMapping("buyCar")
    public String buyCar(HttpSession session, HttpServletResponse response, HttpServletRequest request) throws IOException {
        // 处理客户端编译的乱码
        response.setContentType("text/html;charset:utf-8");
        // 处理响应的乱码
        response.setCharacterEncoding("utf-8");
        // 处理请求的乱码
        request.setCharacterEncoding("utf-8");
        //打印alert信息
        PrintWriter out = response.getWriter();

        User user = (User) session.getAttribute("userCheck");

        if (user != null) {
            System.out.println("进入购物车：" + user.toString());
            return "front/cart";
        } else {
            out.print("<script>alert('请先登录再查看购物车！');window.location='/login_front';</script>");
            return null;
        }
    }

    @RequestMapping("exit")
    @ResponseBody
    public int exit(HttpSession session) {
        session.invalidate();
        return 1;
    }

    /*@RequestMapping("searchByBookName")
    public String searchByBookName(@RequestParam("bookname") String bookname, Model model, HttpServletResponse response, HttpServletRequest request, HttpSession session) throws IOException {
        // 处理客户端编译的乱码
        response.setContentType("text/html;charset:utf-8");
        // 处理响应的乱码
        response.setCharacterEncoding("utf-8");
        // 处理请求的乱码
        request.setCharacterEncoding("utf-8");
        //打印alert信息
        PrintWriter out = response.getWriter();

        User user = (User) session.getAttribute("userCheck");
        if(user != null){
            System.out.println("shop页面input传递的值：" + bookname);
            List<BookDetail> bookDetailList = detailService.searchByBookName(bookname);
            session.setAttribute("userCheck", user);

            model.addAttribute("user", user);
            model.addAttribute("size", bookDetailList.size());
            model.addAttribute("detailAllBook", bookDetailList);
            return "front/shopList";
        }else{
            out.print("<script>alert('请先登录再查看购物车！');window.location='/login_front';</script>");
            return null;
        }
    }*/

}
