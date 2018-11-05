package com.yyc;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yyc.dao.AppointmentDao;
import com.yyc.entity.Appointment;

public class AppointmentDaoTest extends BaseTest {
	@Autowired
	private AppointmentDao a;
	@Test
	public void testQueryById() throws Exception {
        long bookId = 1001;
        Appointment a1 = a.queryById(bookId);
        
  
        System.out.println(a1);
        System.out.println(111111);
        
    }
}
