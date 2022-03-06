package com.atguigu.spring5.test;

import com.atguigu.spring5.config.TxConfig;
import com.atguigu.spring5.entity.Book;
import com.atguigu.spring5.service.BookService;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-02-27 22:05
 */
public class TestJdbcTemplate {
    @Test
    public void testJdbcTemplate(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUserName("java");
//        book.setUstatus("a");
//        bookService.addBook(book);
        bookService.findBook("1");
    }

    @Test
    public void testAccount(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testAccount2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
