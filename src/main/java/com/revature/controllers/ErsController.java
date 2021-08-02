package com.revature.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Reimbursement;
import com.revature.repos.ErsDaoImpl;

public class ErsController {
	ErsDaoImpl usr = new ErsDaoImpl();
	private ObjectMapper objectMapper = new ObjectMapper();
	
	public void getAllEmployees(HttpServletResponse response) throws IOException {
		//List<Home> list = homeService.getAllHomes();
		List<Reimbursement> list = new ArrayList<>();
		list = usr.finaAllErs();
		
		String json = objectMapper.writeValueAsString(list);
		response.getWriter().print(json);
		response.setStatus(200);
	}
	
	public void getEmployee(HttpServletResponse response, String name) throws IOException {
		int especifico = Integer.parseInt(name.replace("%20", " "));
		Reimbursement user = usr.findErsById(especifico);
		String json = objectMapper.writeValueAsString(user);
		response.getWriter().print(json);
		response.setStatus(200);
	}
}
