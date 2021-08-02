package com.revature.services;

import com.revature.models.User;

public class EncryptPassword {
	public boolean encryption (User user, String pass) {
		char[] ch = pass.toCharArray();
		
		for(int i =0; i < ch.length; i++) {
			ch[i] = (char)(ch[i] + 3);
		}
		String newPass = String.valueOf(ch);
		if(user.getPassword().equals(newPass))
			return true;
		else
			return false;
	}
}
