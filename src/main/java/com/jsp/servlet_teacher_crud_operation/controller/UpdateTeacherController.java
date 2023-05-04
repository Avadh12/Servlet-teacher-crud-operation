package com.jsp.servlet_teacher_crud_operation.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.servlet_teacher_crud_operation.dto.Teacher;

public class UpdateTeacherController extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));

		String name = req.getParameter("name");

		String email = req.getParameter("email");
		
		long phone = Integer.parseInt(req.getParameter("phone"));
		
		Teacher teacher = new Teacher();
		
		teacher.setName(name);
		teacher.setEmail(email);
		teacher.setPhone(phone);
	}

}
