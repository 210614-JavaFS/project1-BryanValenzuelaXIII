package com.revature.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.controllers.ErsController;
import com.revature.controllers.UserController;

public class FrontControllerServlet extends HttpServlet{

	UserController usr = new UserController();
	ErsController ers = new ErsController();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/json");
		
		response.setStatus(404); 
		
		final String URL = request.getRequestURI().replace("/Pj1/", "");
		
		String[] UrlSections = URL.split("/");
		
		switch (UrlSections[0]) {
		case "employees":
			usr.getAllEmployees(response);
			break;
		case "reimbursement":
			ers.getAllEmployees(response);
			break;
		}
	}

	
}
