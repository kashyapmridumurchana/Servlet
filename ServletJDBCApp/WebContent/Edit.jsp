<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import ="com.bridgelabz.model.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
    User user = null;
    if (session.getAttribute("user") == null) {
        response.sendRedirect("index.html");
    } else
    {
            user =(User)(session.getAttribute("user"));
    }
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
<div id="register" class="animate form">
            <form  action ="edit" method="post">
                <h1> Sign up </h1>
               
                <p>
                    <label for="email" data-icon="e" > Your email</label>
                    <input id="email" name="email" required="required" type="email" />
                </p>
                <p>
                    <label for="password" data-icon="p">Your password </label>
                    <input id="password" name="password" required="required" type="password"/>
                </p>
                <p>
                    <label for="telNo" data-icon="p">Your Phone Number </label>
                    <input id="telNo" name="telNo" required="required" type="number" />
                </p>
               
                <p class="signin button">
                    <input type="submit" value="save"/>
                </p>
            </form>
        </div>


</form>
</body>
</html>