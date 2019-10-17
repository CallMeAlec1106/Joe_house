package com.engineering.bookpurchase.controller;

import com.engineering.bookpurchase.admin.pojo.BookAdmin;
import com.engineering.bookpurchase.admin.service.AdminService;
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
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private FrontService frontService;
    @Autowired
    private DetailService detailService;

    @RequestMapping("login_back")
    public String index(){
        System.out.println("进入后台管理员！！");
        return "login";
    }

    @RequestMapping("loginAdmin")
    public String loginAdmin(String username, String password, Model model) {
        System.out.println(username + "  " + password);
        BookAdmin loginAdmin = adminService.loginAdmin(username, password);
        if (" ".equals(loginAdmin) || null == loginAdmin) {
            model.addAttribute("Error", "账号或密码错误!");
            return "login";
        } else {
            model.addAttribute("loginAdmin", loginAdmin);
            return "index";
        }
    }

    @RequestMapping("/login_front")
    public String loginFront(){
        System.out.println("进入前台用户登录！！");
        return "front/login_front";
    }

    @RequestMapping("loginUser")
    @ResponseBody
    public int login(@RequestParam("username")String username, @RequestParam("password")String password, Model model, HttpSession session){
        System.out.println(username + "  " + password);
        User user = frontService.LoginUser(username,password);
        if(user != null){
            session.setAttribute("user",user);
            return 1;
        }else{
            return -1;
        }
    }
    @RequestMapping("sessionUser")
    public String session(HttpSession session, Model model, HttpServletResponse response, HttpServletRequest request) throws IOException {
        // 处理客户端编译的乱码
        response.setContentType("text/html;charset:utf-8");
        // 处理响应的乱码
        response.setCharacterEncoding("utf-8");
        // 处理请求的乱码
        request.setCharacterEncoding("utf-8");
        //打印alert信息
        PrintWriter out = response.getWriter();


        User user = (User) session.getAttribute("user");
        System.out.println(user);
        if( user != null){
            session.setAttribute("userCheck",user);

            List<BookDetail> detailAllBook = detailService.selectAllBook();
            System.out.println(" 多少本书： "+detailAllBook.size());
            model.addAttribute("size",detailAllBook.size());
            model.addAttribute("user",user);
            model.addAttribute("detailAllBook",detailAllBook);
            return "front/shopList";
        }else{
            out.print("<script>alert('请先登录再浏览网上书店！');window.location='/login_front';</script>");
            return null;
        }
    }

    /**
     * 前段书籍查询
     */
    @RequestMapping("searchByBookName")
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
    }

}
