package com.xu.controller;

import com.xu.pojo.Books;
import com.xu.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //controller 调 service
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookServiceImpl bookService;

    //查询全部书籍，并且返回一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list",books);
        return "allBook";
    }
    //跳转到添加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }
    //添加书籍请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook=>"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook";//重定向到 @RequestMapping("/allBook")请求
    }
    //跳转到更新书籍页面
    @RequestMapping("/toUpdataBook")
    public String toUpdataBook(){
        return "updateBook";
    }
}
