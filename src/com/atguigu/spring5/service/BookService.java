package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.BookDao;
import com.atguigu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-02-27 21:12
 */

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public void addBook(Book book){
        bookDao.add(book);
    }

    public void findBook(String id){
        System.out.println(bookDao.findBook(id));
    }
}
