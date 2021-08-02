package com.revature.controllers;

import com.revature.models.User;
import com.revature.repos.UserDAOImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UserController {
	
	private static UserDAOImpl usr = new UserDAOImpl();
	private ObjectMapper objectMapper = new ObjectMapper();
	
	public void getAllEmployees(HttpServletResponse response) throws IOException {
		//List<Home> list = homeService.getAllHomes();
		List<User> list = new ArrayList<>();
		list = usr.finaAllUser();
		
		String json = objectMapper.writeValueAsString(list);
		response.getWriter().print(json);
		response.setStatus(200);
	}
	
	public void getEmployee(HttpServletResponse response, String name) throws IOException {
		int especifico = Integer.parseInt(name.replace("%20", " "));
		User user = usr.findByUsernameEmployee(especifico);
		String json = objectMapper.writeValueAsString(user);
		response.getWriter().print(json);
		response.setStatus(200);
	}

}
