package com.yyc;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yyc.dao.BookDao;
import com.yyc.entity.Book;

public class BookDaoTest extends BaseTest {

    @Autowired
    private BookDao bookDao;
    @Test
    public void testQueryById() throws Exception {
        long bookId = 1001;
        Book book = bookDao.queryById(bookId);
        System.out.println(book);
    }

  
    public void testQueryAll() throws Exception {
        List<Book> books = bookDao.queryAll(0, 4);
        for (Book book : books) {
            System.out.println(book);
        }
    }

    
    public void testReduceNumber() throws Exception {
        long bookId = 1001;
        int update = bookDao.reduceNumber(bookId);
        System.out.println("update=" + update);
    }

}