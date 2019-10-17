package com.engineering.bookpurchase.buycar.controller;

import com.engineering.bookpurchase.buycar.pojo.BookBuycar;
import com.engineering.bookpurchase.buycar.pojo.BookBuycarExample;
import com.engineering.bookpurchase.buycar.service.BuycarService;
import com.engineering.bookpurchase.detail.pojo.BookDetail;
import com.engineering.bookpurchase.detail.service.DetailService;
import com.engineering.bookpurchase.front.pojo.User;
import com.engineering.bookpurchase.user.pojo.BookUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("buycar")
public class BuycarController {

    @Autowired
    private BuycarService buycarService;

    @Autowired
    private DetailService detailService;

    @RequestMapping("addBuycar")
    @ResponseBody
    public Integer addBuycar(@RequestParam("bookid") String bookid,HttpSession session){
        User userCheck =(User) session.getAttribute("user");
        Integer consumerid = userCheck.getConsumerid();
        List<BookBuycar> bookBuycars = buycarService.selectBuycarBook(Integer.valueOf(bookid),consumerid);
        int number=0;
        if(bookBuycars.size()>0){
            //获取单价
            String priceString = bookBuycars.get(0).getBookDetail().getPrice();
            Float price = Float.valueOf(priceString);
            //获取数量
            String oq = bookBuycars.get(0).getOrderQuantity();
            int orderQuantityInt = Integer.valueOf(oq);
            Float orderQuantityFloat = Float.valueOf(oq);
            orderQuantityInt+=1;
            //总价
            Float totalPriceString = price * orderQuantityFloat;
            float num=(float)(Math.round(totalPriceString*100)/100);
            System.out.println("num的值："+num);
            String orderQuantity = String.valueOf(orderQuantityInt);
            Integer buycarId = bookBuycars.get(0).getBuycarId();

            //修改数据库的数据
            BookBuycar bookBuycar = new BookBuycar();
            bookBuycar.setBuycarId(buycarId);
            bookBuycar.setOrderQuantity(orderQuantity);
            bookBuycar.setTotalPrice(String.valueOf(totalPriceString));

            number = buycarService.updateByPrimaryKeySelective(bookBuycar);

        }else {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            BookDetail bookDetail = detailService.selectByPrimaryKey(Integer.valueOf(bookid));
            String price = bookDetail.getPrice();
            //添加数据到数据库
            BookBuycar bookBuycar = new BookBuycar();
            bookBuycar.setUserId(consumerid);
            bookBuycar.setBookDetailId(Integer.valueOf(bookid));
            bookBuycar.setOrderQuantity("1");
            bookBuycar.setTotalPrice(price);
            bookBuycar.setStatus("1");
            bookBuycar.setCreateDate(formatter.format(new Date()));
            number = buycarService.insert(bookBuycar);
            System.out.println("添加到购物车");
        }
        return number;
    }

    @RequestMapping("buyCarList")
    public String buyCarList(Model model,HttpSession session){
        User userCheck =(User) session.getAttribute("user");
        if(userCheck!=null){
            Integer consumerid = userCheck.getConsumerid();
            System.out.println("用户id："+consumerid);
            List<BookBuycar> bookBuycars = buycarService.selectByExample(consumerid);
            model.addAttribute("bookBuycars",bookBuycars);
            return "front/cart";
        }else {
            return "forward:/login_front";
        }
    }

    @RequestMapping("deleteCart")
    @ResponseBody
    public Integer deleteCart(@RequestParam("buycarId") Integer buycarId){
        int number = buycarService.deleteByPrimaryKey(buycarId);
        return number;
    }

}