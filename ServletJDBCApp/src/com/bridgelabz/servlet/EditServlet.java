package com.bridgelabz.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.dbutil.MySQLConnUtils;
import com.bridgelabz.model.User;

public class EditServlet extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(true);
		User user = (User) session.getAttribute("user");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		long mobileNumber =Long.parseLong(req.getParameter("telNo"));
		System.out.println(email);
		System.out.println(password);
		System.out.println(mobileNumber);

		if (email.equals("") || password.equals("") || mobileNumber==0) 
		{	
			RequestDispatcher rdObj = req.getRequestDispatcher("/Edit.jsp");
		    rdObj.forward(req, resp); 
			
		} else {
			user.setTel(mobileNumber);
			user.setEmail(email);
			user.setPassword(password);
			try {
				System.out.println(user.getName());
				MySQLConnUtils.edit(user);
				RequestDispatcher rdObj = req.getRequestDispatcher("/PersonProfile.jsp");
			    rdObj.forward(req, resp); 
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
