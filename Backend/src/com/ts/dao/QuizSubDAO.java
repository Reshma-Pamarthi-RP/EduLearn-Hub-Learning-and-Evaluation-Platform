package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.db.HibernateTemplate;
import com.ts.dto.QuizSub;

public class QuizSubDAO {
private SessionFactory factory = null;
	
	public int register(QuizSub quizsub) {
		System.out.println(quizsub); 
		return HibernateTemplate.addObject(quizsub);
	}

	public List<QuizSub> getAllQuiz(String subjectName) {
		List<QuizSub> quizsub = HibernateTemplate.getAllQuiz(subjectName);
		return quizsub;
	}

}
