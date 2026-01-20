package com.ts.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.ts.db.HibernateTemplate;
import com.ts.dto.Quiz;

public class QuizDAO {
	
	private SessionFactory factory = null;
	
	public int register(Quiz quiz) {
		System.out.println(quiz); 
		return HibernateTemplate.addObject(quiz);
	}
	
	public static List<Quiz> getAllQues(String quizName) {
		List<Quiz> questions=(List)HibernateTemplate.getQuestionsListByName(quizName);
		System.out.println("Inside All questions ..."+questions);
		return questions;
	}

}
