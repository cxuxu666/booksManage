package com.xu.service.impl;

import com.xu.service.BookService;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookServiceImplTest extends TestCase {

    public void testDeleteBookById() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = (BookService) ac.getBean("bookServiceImpl");
        bookService.deleteBookById(4);
    }
}