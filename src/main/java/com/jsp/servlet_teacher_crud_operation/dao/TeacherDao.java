package com.jsp.servlet_teacher_crud_operation.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jsp.servlet_teacher_crud_operation.connection.TeacherConnection;
import com.jsp.servlet_teacher_crud_operation.dto.Teacher;

public class TeacherDao 
{
	Connection connection = TeacherConnection.getTeacherConnection();
	
	public Teacher saveTeacher(Teacher teacher) {
		String insertTeacherQuery = "insert into teacher values(?,?,?,?)";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(insertTeacherQuery);
			preparedStatement.setInt(1, teacher.getId());
			preparedStatement.setString(2, teacher.getName());
			preparedStatement.setString(3, teacher.getEmail());
			preparedStatement.setLong(4, teacher.getPhone());
			preparedStatement.execute();
			
			return teacher;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	// getByIdMethod
		public int getById(int id) {

			Connection connection = TeacherConnection.getTeacherConnection();

			String getEmployeeQuery = "SELECT * FROM teacher where teacherid=?";

			try {

				PreparedStatement preparedStatement = connection.prepareStatement(getEmployeeQuery);

				preparedStatement.setInt(1, id);

				ResultSet resultSet = preparedStatement.executeQuery();

				int tableId = 0;
				if (resultSet.next()) {
					tableId = resultSet.getInt("teacherid");
				}
				return tableId;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
		}
	
	public int deleteTeacher(int id) {

		Connection connection = TeacherConnection.getTeacherConnection();

		String deleteEmployeeQuery = "delete from teacher where id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(deleteEmployeeQuery);

			preparedStatement.setInt(1, id);

			return preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	// displayMethodForEmployee
	public List<Teacher> displaTeacher() {

		Connection connection = TeacherConnection.getTeacherConnection();

		String displayTeacher = "SELECT * FROM TEACHER";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(displayTeacher);

			List<Teacher> teachers = new ArrayList<Teacher>();

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				Teacher teacher = new Teacher();

				teacher.setId(resultSet.getInt("id"));
				teacher.setName(resultSet.getString("name"));
				teacher.setEmail(resultSet.getString("email"));
				teacher.setPhone(resultSet.getLong("phone"));

				teachers.add(teacher);
			}

			return teachers;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	// updateMethod For Employee
	public int updateEmployee(Teacher teacher, int teacherId) {

		Connection connection = TeacherConnection.getTeacherConnection();

		String updateQuery = "update teacher set name=?,email=?,phone=?,where id=?";

		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(updateQuery);
			preparedStatement.setString(1, teacher.getName());
			preparedStatement.setString(2, teacher.getEmail());
			preparedStatement.setLong(3, teacher.getPhone());
			preparedStatement.setDouble(4, teacher.getId());

			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public class PrintEvenCharacters {
    public static void main(String[] args) {
        String input = "I love my country";
        printEvenCharacters(input);
    }

    private static void printEvenCharacters(String input) {
        for (int i = 0; i < input.length(); i += 2) {
            char character = input.charAt(i);
            if (character != ' ') {
                System.out.print(character);
            }
        }
    }
}

}
