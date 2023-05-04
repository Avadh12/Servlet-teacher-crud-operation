package com.jsp.servlet_teacher_crud_operation.service;

import java.util.List;

import com.jsp.servlet_teacher_crud_operation.dao.TeacherDao;
import com.jsp.servlet_teacher_crud_operation.dto.Teacher;

public class TeacherService {
	
	TeacherDao dao = new TeacherDao();
	public Teacher saveTeacher(Teacher teacher) {
		return dao.saveTeacher(teacher);
	}
	
	// delete method
		public int deleteTeacher(int id) {

			return dao.deleteTeacher(id);
		}

		// displayMethodForEmployee
		public List<Teacher> displaTeacher() {

			return dao.displaTeacher();
		}

		// updateMethod For Employee
		public int updateEmployee(Teacher teacher, int teacherId) {

			return dao.updateEmployee(teacher, teacherId);
		}

}
