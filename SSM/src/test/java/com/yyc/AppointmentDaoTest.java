package com.yyc;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yyc.dao.AppointmentDao;
import com.yyc.entity.Appointment;

public class AppointmentDaoTest extends BaseTest {
	@Autowired
	private AppointmentDao a;
	@Test
	public void testInsertAppointment() throws Exception{
		 long bookId = 1001;
	     long studentId=12345678910l;
	     int i=a.insertAppointment(bookId, studentId);
	     System.out.println(i);
	}
	@Test
	public void testQueryByKeyWithBook() throws Exception {
        long bookId = 1001;
        long studentId=12345678910l;
        Appointment a1 = a.queryByKeyWithBook(bookId,studentId);
  
  
        System.out.println(a1);
        System.out.println(a1.getBook());
        
    }
}
