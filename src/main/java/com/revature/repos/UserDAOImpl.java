package com.revature.repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.connetion.ConnectionUtil;
import com.revature.models.User;
import com.revature.models.UserRole;

public class UserDAOImpl implements UserDao{

	public List<User> finaAllUser() {
		// TODO Auto-generated method stub
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM usuario";
					
			Statement statement = conn.createStatement();
			
			ResultSet result = statement.executeQuery(sql);
			
			List<User> list = new ArrayList<>();
			
			while(result.next()) {
				User user = new User();
				user.setUserId(result.getInt("userId"));
				user.setUserName(result.getString("username"));
				user.setPassword(result.getString("pass"));
				user.setNombre(result.getString("nombre"));
				user.setLastName(result.getString("lastName"));
				user.setEmail(result.getString("email"));
				int role = result.getInt("uRole");
				if (role == 0)
					user.setUserRoleId(UserRole.EMPLOYEE);
				else
					user.setUserRoleId(UserRole.FINANCE_MANAGER);
				
				list.add(user);
			}
			
			return list;
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	public User findByUsernameEmployee(int number) {
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM usuario WHERE userId = ?;";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			
			//This is where SQL injection is checked for.
			statement.setInt(1, number);
			
			ResultSet result = statement.executeQuery();
			
			User user = new User();
			
			while(result.next()) {
				user.setUserId(result.getInt("userId"));
				user.setUserName(result.getString("username"));
				user.setPassword(result.getString("pass"));
				user.setNombre(result.getString("nombre"));
				user.setLastName(result.getString("lastName"));
				user.setEmail(result.getString("email"));
				int role = result.getInt("uRole");
				if (role == 0)
					user.setUserRoleId(UserRole.EMPLOYEE);
				else
					user.setUserRoleId(UserRole.FINANCE_MANAGER);
			}
			
			return user;
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
