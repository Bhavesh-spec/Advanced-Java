<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    %>
      <%@ page import="session.AdminBean" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <% AdminBean ab = (AdminBean)session.getAttribute("ab"); %>
 <%=ab.getAdminName() %>
 <a href="view">view</a><br>
<a href="update">Update</a><br>
<a href="logout">LogOut</a><br>
</body>
</html>