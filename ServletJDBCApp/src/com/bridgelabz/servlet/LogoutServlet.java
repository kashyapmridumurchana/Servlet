package com.bridgelabz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet 
{

	 
protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		//HttpSession session = request.getSession(false);
	 // PrintWriter out = response.getWriter();  
//		String name=(String) session.getAttribute("user");
		 //session.setAttribute(name, null);
//		session.removeAttribute(name);
	 
	 
		 RequestDispatcher rd=request.getRequestDispatcher("/index.html");
		 rd.forward(request, response);
		 Cookie ck=new Cookie("user","");//deleting value of cookie  
		  ck.setMaxAge(0);//changing the maximum age to 0 seconds  
		  response.addCookie(ck);
//		  Cookie ck1[]=request.getCookies();  
//		    for(int i=0;i<ck1.length;i++){  
//		     out.print("<br>"+ck1[i].getName()+" "+ck1[i].getValue());//printing name and value of cookie 
//		    }
	
	}
}
