package com.bridgelabz.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.dbutil.MySQLConnUtils;
import com.bridgelabz.model.User;

public class RegisterServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) {

		String name = request.getParameter("name");
		System.out.println(name);
		String password = request.getParameter("password");
		System.out.println(password);
		String email = request.getParameter("email");
		System.out.println(email);
		long telNo = Long.parseLong(request.getParameter("telNo"));
		System.out.println(telNo);

		User user = new User(name, password, email, telNo);
		try {
			MySQLConnUtils.registration(user);
		} catch (Exception e) {
			System.out.println("Error");
		}

	}
}
