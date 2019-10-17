package com.engineering.bookpurchase.admin.controller;

import com.engineering.bookpurchase.admin.pojo.BookAdmin;
import com.engineering.bookpurchase.admin.pojo.BookAdminExample;
import com.engineering.bookpurchase.admin.service.AdminService;
import com.engineering.bookpurchase.common.utils.LayuiTableResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/adminList")
    public String adminList(BookAdminExample bookAdminExample, Model model) {
       /* List<BookAdmin> bookAdmins = adminService.selectAdmin(bookAdminExample);
        model.addAttribute("bookAdmin",bookAdmins);*/
        return "admin-list";
    }

    @ResponseBody
    @RequestMapping("/adminListDate")
    public LayuiTableResultUtil<List> adminListDate(HttpServletRequest httpServletRequest) {
        Integer limit = Integer.valueOf(httpServletRequest.getParameter("limit"));
        Integer page = Integer.valueOf(httpServletRequest.getParameter("page"));
        //查询管理员列表
        List<BookAdmin> bookAdmins = adminService.selectAdmin((page - 1) * limit, limit);
        //查询管理员总数
        int selectAdminCount = adminService.selectAdminCount();
        //layui框架分页
        LayuiTableResultUtil<List> layuiTableResultUtil = new LayuiTableResultUtil<>("", bookAdmins, 0, selectAdminCount);
        return layuiTableResultUtil;
    }

    /**
     * 根据管理员id跳转至修改页面并显示数据
     */
    @GetMapping("/adminEdit/{adminID}")
    public String adminEdit(@PathVariable("adminID") Integer adminID, Model model) {
        //根据id查询管理员
        BookAdmin bookAdmin = adminService.selectByPrimaryKey(adminID);
        //把管理员的信息加入到模块中
        model.addAttribute("bookAdmin", bookAdmin);
        return "admin/admin-edit";
    }

    /**
     * 保存修改管理员信息
     */
    @PostMapping("/adminEdit/saveAdminEdit")
    @ResponseBody
    public Integer saveAdminEdit(BookAdmin bookAdmin) {
        //更新管理员信息
        int updateCount = adminService.updateBookAdmin(bookAdmin);
        return updateCount;
    }

    /**
     * 管理员删除
     */
    @RequestMapping("/deleteAdmin")
    @ResponseBody
    public Integer deleteAdmin(@RequestParam("adminID") int adminID){
        System.out.println("删除的管理员ID: "+adminID);
        int i = adminService.deleteAdmin(adminID);
        return i;
    }

    /**
     * 管理员查询
     */
    @RequestMapping("/searchByAdmin")
    @ResponseBody
    public LayuiTableResultUtil<List> searchByAdmin(@RequestParam("username") String username,Model model,HttpServletRequest request){
        System.out.println("input传过来的值： "+username);

        //查询管理员
        List<BookAdmin> bookAdmins = adminService.searchByAdmin(username);
        System.out.println("集合的长度："+bookAdmins.size());
        Iterator<BookAdmin> list = bookAdmins.iterator();
        while (list.hasNext()){
            BookAdmin bookadmin = list.next();
            System.out.println(bookadmin.getAdminid()+bookadmin.getUsername());
        }
        //layui框架分页
        LayuiTableResultUtil<List> layuiTableResultUtil = new LayuiTableResultUtil<List>("", bookAdmins, 0, bookAdmins.size());
        if(layuiTableResultUtil != null){
            return layuiTableResultUtil;
        }else{
            return null;
        }
        /* if(bookAdmins.size() > 0){
            model.addAttribute("bookAdmins",bookAdmins);
            System.out.println(layuiTableResultUtil);
            return layuiTableResultUtil;
        }else {
            return null;
        }*/
    }

    //进入管理员添加页面
    @RequestMapping("add")
    public String index() {
        System.out.println("进入管理员添加页面！！");
        return "admin-add";
    }

    //管理员添加
    @RequestMapping("/addAdmin")
    @ResponseBody
    public int addAdmin(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println(username + " !!!  " + password);
        Integer i = adminService.addAdmin(username, password);
        return i;
    }

}