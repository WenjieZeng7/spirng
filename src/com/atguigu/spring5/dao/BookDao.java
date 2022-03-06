package com.atguigu.spring5.dao;

import com.atguigu.spring5.entity.Book;
/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-02-27 21:10
 */
public interface BookDao {
    public void add(Book book);
    public Book findBook(String id);
}
