<%@page import="com.jsp.servlet_teacher_crud_operation.dto.Teacher"%>
<%@page import="com.jsp.servlet_teacher_crud_operation.dao.TeacherDao"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
<jsp:include page="home.jsp"/>
	
	<!-- ScrpitLet tag -->
	<%
		TeacherDao teacherDao = new TeacherDao();
	
		List<Teacher> teachers=teacherDao.displaTeacher();
	%>
	
	<table class="table table-dark table-striped">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Phone</th>
      <th scope="col">Delete</th>
      <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>
  <%for(Teacher teacher :teachers){%>
    <tr>
      <td><%=teacher.getId()%></td>
      <td><%=teacher.getName()%></td>
      <td><%=teacher.getEmail()%></td>
      <td><%=teacher.getPhone()%></td>
      <td><a href="delete?id=<%=teacher.getId()%>"><button>Delete</button></a></td>
      
    </tr>
   <%}%> 
  </tbody>
</table>
</body>
</html>