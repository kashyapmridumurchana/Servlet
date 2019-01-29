<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import ="com.bridgelabz.model.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ProfileJsp</title>
</head>
<body>
	<%
	User user = new User();
	user =(User)(session.getAttribute("user"));
		String sessionID = null;
		String userName = null;
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("user"))
					userName = cookie.getValue();
			}
		}
	%>
	<h3>
		Hi
		<%=userName%></h3>
	<br>
	Your name:<%=user.getName()%>
	<br>
   Your	email:<%=user.getEmail()%>
	<br>
   Your	phone no:<%=user.getTel()%>
	
	<form action="<%=response.encodeURL("Edit.jsp") %>" method="post">
		<input type="submit" value="edit">
	</form>
	<form action="logout" method="post">
		<input type="submit" value="Logout">
	</form>
</body>
</html>