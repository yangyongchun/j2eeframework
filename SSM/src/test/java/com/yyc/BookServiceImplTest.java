package com.yyc;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yyc.dto.AppointExecution;
import com.yyc.exception.NoNumberException;
import com.yyc.exception.RepeatAppointException;
import com.yyc.service.BookService;

public class BookServiceImplTest extends BaseTest {

    @Autowired
    private BookService bookService;

    @Test
    public void testAppoint(){
        long bookId = 1001;
        long studentId = 12345678910L;
        try {
        AppointExecution execution = bookService.appoint(bookId, studentId);
        System.out.println(execution);
        }
        catch (NoNumberException e1) {
        	System.out.println(e1.getMessage());
            throw e1;
        } catch (RepeatAppointException e2) {
        	System.out.println(e2.getMessage());
            throw e2;
        }
    }
}
