package com.jsp.bank.branch;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("osama");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		
		Bank bank = new Bank();
		bank.setName("PNB");
		
		
		Branch branch1 = new Branch();
		branch1.setName("PNB-VASHI");
	    branch1.setIfsc_code("PNBVASHI123");
	    
	    
	    Branch branch2 = new Branch();
		branch2.setName("PNB-PANVEL");
	    branch2.setIfsc_code("PNBPANVEL456");
	    
	    List<Branch > branches = new ArrayList<Branch>();
	    branches.add(branch1);
	    branches.add(branch2);
	    
	    bank.setBranches(branches);
	    branch1.setBank(bank);
	    branch2.setBank(bank);
	    
	    entityTransaction.begin();
		entityManager.persist(bank);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		
		entityTransaction.commit();
	    
	    
	    

	    
	    
	    
	    

		
		
		
	}
	
}
