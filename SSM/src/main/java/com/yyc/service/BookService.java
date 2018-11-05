package com.yyc.service;

import java.util.List;

import com.yyc.dto.AppointExecution;
import com.yyc.entity.Book;

public interface BookService {

    /**
     * 查询一本图书
     * 
     * @param bookId
     * @return
     */
    Book getById(long bookId);

    /**
     * 查询所有图书
     * 
     * @return
     */
    List<Book> getList();

    /**
     * 预约图书
     * 
     * @param bookId
     * @param studentId
     * @return
     */
    AppointExecution appoint(long bookId, long studentId);

}
