package com.revature.repos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.connetion.ConnectionUtil;
import com.revature.models.ErsStatus;
import com.revature.models.ErsType;
import com.revature.models.Reimbursement;


public class ErsDaoImpl implements ErsDao{

	@Override
	public List<Reimbursement> finaAllErs() {
		// TODO Auto-generated method stub
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM ERS";
					
			Statement statement = conn.createStatement();
			
			ResultSet result = statement.executeQuery(sql);
			
			List<Reimbursement> list = new ArrayList<>();
			
			while(result.next()) {
				Reimbursement user = new Reimbursement();
				user.setErsId(result.getInt("ersId"));
				user.setErsAmmount(result.getDouble("ersAmmount"));
				user.setErsSumitted(result.getTimestamp("ersSumitted"));
				user.setUserId(result.getInt("userId"));
				int status = result.getInt("ersStatus");
				switch(status) {
					case 0: user.setEstatus(ErsStatus.SUBMITTED);
						break;
					case 1: user.setEstatus(ErsStatus.PENDING);
						break;
					case 2:user.setEstatus(ErsStatus.ACCEPTED);
						break;
					case 3:user.setEstatus(ErsStatus.DENIED);
						break;
					default:
						break;
				}
				
				int tipo = result.getInt("ersStatus");
				switch(tipo) {
				case 0: user.setTipo(ErsType.TRAVEL);
					break;
				case 1: user.setTipo(ErsType.EDUCATION);
				break;
				case 2: user.setTipo(ErsType.SUPPLIES);
				break;
				case 3: user.setTipo(ErsType.TOOLS);
				break;
				case 4: user.setTipo(ErsType.OTHER);
				break;
				default:
					break;
				}
				
				list.add(user);
			}
			
			return list;
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public Reimbursement findErsById(int id) {
		// TODO Auto-generated method stub
		try(Connection conn = ConnectionUtil.getConnection()){
			String sql = "SELECT * FROM ERS WHERE userId = ?;";
			
			PreparedStatement statement = conn.prepareStatement(sql);
			
			//This is where SQL injection is checked for.
			statement.setInt(1, id);
			
			ResultSet result = statement.executeQuery();
			
			Reimbursement user = new Reimbursement();
			
			while(result.next()) {
				user.setErsId(result.getInt("ersId"));
				user.setErsAmmount(result.getDouble("ersAmmount"));
				user.setErsSumitted(result.getTimestamp("ersSumitted"));
				user.setUserId(result.getInt("userId"));
				int status = result.getInt("ersStatus");
				switch(status) {
					case 0: user.setEstatus(ErsStatus.SUBMITTED);
						break;
					case 1: user.setEstatus(ErsStatus.PENDING);
						break;
					case 2:user.setEstatus(ErsStatus.ACCEPTED);
						break;
					case 3:user.setEstatus(ErsStatus.DENIED);
						break;
					default:
						break;
				}
				
				int tipo = result.getInt("ersStatus");
				switch(tipo) {
				case 0: user.setTipo(ErsType.TRAVEL);
					break;
				case 1: user.setTipo(ErsType.EDUCATION);
				break;
				case 2: user.setTipo(ErsType.SUPPLIES);
				break;
				case 3: user.setTipo(ErsType.TOOLS);
				break;
				case 4: user.setTipo(ErsType.OTHER);
				break;
				default:
					break;
				}
			}
			
			return user;
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
