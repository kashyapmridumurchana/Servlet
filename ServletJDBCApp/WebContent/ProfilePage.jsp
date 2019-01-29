<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import ="com.bridgelabz.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>profileJsp</title>
</head>
<body>
    <%

        String sessionID = null;
        String userName = null;
    	
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user"))
                    userName = cookie.getValue();
                if (cookie.getName().equals("JSESSIONID"))
                    sessionID = cookie.getValue();
            }
        }
    %>
    <h3>
        Hi
        <%=userName%>, Login successful.<br>Your Session ID=<%=sessionID%></h3>
    <br>
   
    <a href ="PersonProfile.jsp">Proceed to profile--></a>


</body>
</html>