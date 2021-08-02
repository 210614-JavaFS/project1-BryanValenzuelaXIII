package com.revature.repos;

import java.util.List;

import com.revature.models.Reimbursement;

public interface ErsDao {
	public List<Reimbursement> finaAllErs();
	public Reimbursement findErsById(int id);
}
