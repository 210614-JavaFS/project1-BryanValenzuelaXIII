package com.revature.models;

import java.sql.Timestamp;

public class Reimbursement {
	private int ersId;
	private double ersAmmount;
	private Timestamp ersSumitted;
	private int userId;
	private ErsStatus estatus;
	private ErsType tipo;
	
	public Reimbursement(int ersId, double ersAmmount, Timestamp ersSumitted, int userId, ErsStatus estatus,
			ErsType tipo) {
		super();
		this.ersId = ersId;
		this.ersAmmount = ersAmmount;
		this.ersSumitted = ersSumitted;
		this.userId = userId;
		this.estatus = estatus;
		this.tipo = tipo;
	}
	public Reimbursement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getErsId() {
		return ersId;
	}
	public void setErsId(int ersId) {
		this.ersId = ersId;
	}
	public double getErsAmmount() {
		return ersAmmount;
	}
	public void setErsAmmount(double ersAmmount) {
		this.ersAmmount = ersAmmount;
	}
	public Timestamp getErsSumitted() {
		return ersSumitted;
	}
	public void setErsSumitted(Timestamp ersSumitted) {
		this.ersSumitted = ersSumitted;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public ErsStatus getEstatus() {
		return estatus;
	}
	public void setEstatus(ErsStatus estatus) {
		this.estatus = estatus;
	}
	public ErsType getTipo() {
		return tipo;
	}
	public void setTipo(ErsType tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Reimbursement [ersId=" + ersId + ", ersAmmount=" + ersAmmount + ", ersSumitted=" + ersSumitted
				+ ", userId=" + userId + ", estatus=" + estatus + ", tipo=" + tipo + "]";
	}
	
	
}
