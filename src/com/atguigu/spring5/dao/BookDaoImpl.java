package com.atguigu.spring5.dao;

import com.atguigu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;




/**
 * @author Jesse 1094798816@qq.com
 * @create 2022-02-27 21:10
 */

@Repository
public class BookDaoImpl implements BookDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        //1 创建 sql 语句
        String sql = "insert into t_book values(?,?,?)";
        //2 调用方法实现
        Object[] args = {book.getUserId(), book.getUserName(),
                book.getUstatus()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public Book findBook(String id) {
        String sql = "select * from t_book where UserID=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }
}
