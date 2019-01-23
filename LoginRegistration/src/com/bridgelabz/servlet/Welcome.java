package com.bridgelabz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	// This Method Is Called By The Servlet Container To Process A 'POST' Request.

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		handleRequest(req, resp);
	}
	public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html");

		// Post Parameters From The Request

		String param1 = req.getParameter("name");
		//String param2=req.getParameter("password");

		// Building & Printing The HTML Response Code

		PrintWriter out = resp.getWriter();

		out.write("<html><body><div id='serlvetResponse' style='text-align: center;'>");

		out.write("<h2>Welcome home</h2>");

		out.write("<p style='color: green; font-size: large;'>Congratulations! <span style='text-transform: capitalize;'>" + param1 + "</span>, You are an authorised login!</p>");

		out.write("</div></body></html>");

		out.close();

	}
}
