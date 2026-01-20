package com.ts.dao;

import org.hibernate.SessionFactory;

import com.ts.db.HibernateTemplate;
import com.ts.dto.Credits;

public class CreditsDAO {
private SessionFactory factory = null;
	
	public int register(Credits credit) {
		System.out.println(credit); 
		return HibernateTemplate.addObject(credit);
	}
	
	public int getCredit(int subjectId, int studentId) {
		System.out.println(subjectId+" "+studentId);
		int p = (int)HibernateTemplate.getCredit(subjectId,studentId);
		//System.out.println("In DAO"+credit.toString());
		return p;
	}
}
