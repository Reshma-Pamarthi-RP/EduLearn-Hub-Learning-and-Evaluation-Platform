package com.ts.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.db.HibernateTemplate;
import com.ts.dto.Subject;

public class SubjectDAO {
private SessionFactory factory = null;
	
	public int register(Subject subject) {
		System.out.println(subject); 
		return HibernateTemplate.updateObject(subject);
	}
	
	public static List<Subject> getAllSubjects() {
		List<Subject> subjects=(List)HibernateTemplate.getObjectListByQuery("From Subject");
		System.out.println("Inside All events ..."+subjects);
		return subjects;
	}
	
	public static List<Subject> getAllSubjectsForStu(int studentId) {
		List<Subject> subjects=(List)HibernateTemplate.getObjectListByQuery("From Subject");
		System.out.println("Inside Pat events ..."+ subjects);
		
		return subjects;
	}
	

}
