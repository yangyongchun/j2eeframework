package com.yyc.dao;

import org.apache.ibatis.annotations.Param;

import com.yyc.entity.Appointment;

public interface AppointmentDao{

	Appointment queryByKeyWithBook(@Param("bookId")long bookId,@Param("studentId") long studentId);

	int insertAppointment(@Param("bookId")long bookId,@Param("studentId") long studentId);
}
