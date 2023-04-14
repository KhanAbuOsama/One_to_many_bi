package com.jsp.bank.branch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	private int id;
	private String name;
	private String Ifsc_code;
	
	@ManyToOne
	@JoinColumn
	//difference between the jin column and without join is 
	// in withoutjoin 3 tables r created and with both side excess to overcome the 3 table we came of join concept
	// in join 3rd table is removed by assing the foreign key to branches 
	// cascade is to overcome persist the entityTransaction assigin every branch we use cascade
	private Bank bank;
	
	
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIfsc_code() {
		return Ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		Ifsc_code = ifsc_code;
	}
	
	
	

}
