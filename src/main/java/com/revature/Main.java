package com.revature;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.*;

import com.revature.repos.*;
import com.revature.services.EncryptPassword;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			UserDAOImpl usr = new UserDAOImpl();
			/*
			List<User> list = new ArrayList<>();
			User usuario = new User();
			
			//list = usr.finaAllUser();
			usuario = usr.findByUsernameEmployee(23);
			
			System.out.println(usuario.toString());*/
		/*ErsDaoImpl usr = new ErsDaoImpl();
		List<Reimbursement> list = new ArrayList<>();
		list = usr.finaAllErs();*/
		User usuario = new User();
		usuario = usr.findByUsernameEmployee(23);
		EncryptPassword ps = new EncryptPassword();
		System.out.println("No problemo");
		System.out.println(ps.encryption(usuario, "tessa"));
		//System.out.println(list.get(1).toString());
	}

}
