package com.engineering.bookpurchase.user.controller;

import com.engineering.bookpurchase.admin.pojo.BookAdmin;
import com.engineering.bookpurchase.common.utils.LayuiTableResultUtil;
import com.engineering.bookpurchase.user.pojo.BookUser;
import com.engineering.bookpurchase.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/userList")
    public String searchUserAllList(){
        System.out.println("进入用户页面");
        return "user/member-list";
    }

    /**
     * 查询所有用户并分页
     * @param httpServletRequest
     * @return
     */
    @ResponseBody
    @RequestMapping("/userListDate")
    public LayuiTableResultUtil<List> adminListDate(HttpServletRequest httpServletRequest) {
        Integer limit = Integer.valueOf(httpServletRequest.getParameter("limit"));
        Integer page = Integer.valueOf(httpServletRequest.getParameter("page"));
        //查询管理员列表
        List<BookUser> bookUsers = userService.selectByAllUser((page - 1) * limit, limit);
        //查询管理员总数
        int selectUserCount = userService.selectAllUser();
        //layui框架分页
        LayuiTableResultUtil<List> layuiTableResultUtil = new LayuiTableResultUtil<>("", bookUsers, 0, selectUserCount);
        return layuiTableResultUtil;
    }

    /**
     * 进入用户添加页面
     */
    @RequestMapping("/add")
    public String addUserIntoPage(){
        System.out.println("进入用户添加页面");
        return "user/member-add";
    }

    /**
     * 用户添加
     */
    @RequestMapping("/addUser")
    @ResponseBody
    public int addUser(BookUser bookuser){
        System.out.println(bookuser);
        int i = userService.addUser(bookuser);
        return i;
    }

    /**
     * 删除用户
     */
    @RequestMapping("/deleteByConsumerId")
    @ResponseBody
    public int deleteByUserId(@RequestParam("consumerid") int consumerid){
        System.out.println(consumerid);
        int i = userService.deleteByConsumerId(consumerid);
        return i;
    }

    /**
     * 批量删除
     */
    @RequestMapping("deleteBySelectId")
    @ResponseBody
    public int deleteBySelectId(@RequestParam("consumerid") String consumerid){
        String[] ids = consumerid.split(",");
        System.out.println("  批量删除  ");
        int i = 0;
        for (int j = 0; j < ids.length; j++) {
            i = userService.deleteByConsumerId(Integer.parseInt(ids[j]));
            if(i > 0){
                i = 1;
            }else{
                i = -1;
            }
        }
        return i;
    }

    /**
     * 进入修改用户页面
     */
    @GetMapping("/userEdit/{consumerid}")
    public String userEdit(@PathVariable("consumerid")Integer consumerid,Model model){
        System.out.println(consumerid);
        BookUser bookUser = userService.selectByConsumerId(consumerid);
        System.out.println(bookUser);
        model.addAttribute("bookUser",bookUser);
        return "user/member-edit";
    }
    /**
     * 修改用户
     */
    @PostMapping("/userEdit/saveUserEdit")
    @ResponseBody
    public int saveUserEdit(BookUser bookUser){
        System.out.println("  修改用户  "+bookUser);
        int i = userService.saveUserEdit(bookUser);
        return i;
    }

    /**
     * 用户查询
     */
    @RequestMapping("/searchByUser")
    @ResponseBody
    public LayuiTableResultUtil<List> searchByAdmin(@RequestParam("username") String username,Model model,HttpServletRequest request){
        System.out.println("input传过来的值： "+username);

        //查询用户
        List<BookUser> bookUsers = userService.searchByUser(username);
        System.out.println("集合的长度："+bookUsers.size());
        Iterator<BookUser> list = bookUsers.iterator();
        while (list.hasNext()){
            BookUser bookUser = list.next();
            System.out.println(bookUser.getConsumerid()+bookUser.getUsername());
        }
        //layui框架分页
        LayuiTableResultUtil<List> layuiTableResultUtil = new LayuiTableResultUtil<List>("", bookUsers, 0, bookUsers.size());
        if(layuiTableResultUtil != null){
            return layuiTableResultUtil;
        }else{
            return null;
        }
    }
}
