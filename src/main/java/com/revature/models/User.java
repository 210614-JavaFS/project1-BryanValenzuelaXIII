package com.revature.models;

public class User {
	private int userId;
	private String userName;
	private String password;
	private String nombre;
	private String lastName;
	private String email;
	private UserRole userRoleId;
	
	public User(int userId, String userName, String password, String nombre, String lastName, String email,
			UserRole userRoleId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.nombre = nombre;
		this.lastName = lastName;
		this.email = email;
		this.userRoleId = userRoleId;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserRole getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(UserRole userRoleId) {
		this.userRoleId = userRoleId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", nombre=" + nombre
				+ ", lastName=" + lastName + ", email=" + email + ", userRoleId=" + userRoleId + "]";
	}
	
	
}
