package com.jsp.servlet_teacher_crud_operation.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.servlet_teacher_crud_operation.service.TeacherService;

@WebServlet("/delete")

public class DeleteTeacherController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id=Integer.parseInt(req.getParameter("id"));
		
		TeacherService service = new TeacherService();
		
		int tableId = service.deleteTeacher(id);
		
		if(tableId!=0) {
			req.getRequestDispatcher("display.jsp").forward(req, resp);
		}else {
			req.getRequestDispatcher("display.jsp").forward(req, resp);
		}
	}

}
