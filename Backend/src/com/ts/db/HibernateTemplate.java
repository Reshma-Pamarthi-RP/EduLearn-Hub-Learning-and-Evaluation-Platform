package com.ts.db;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.ts.dto.Mentor;
import com.ts.dto.QuizSub;
import com.ts.dto.Student;

//import com.rest.dto.Department;
//import com.rest.dto.Employee;

public class HibernateTemplate {

	private static SessionFactory sessionFactory;
	
	static {
		sessionFactory=new Configuration().configure().buildSessionFactory();
	}
	
	public static int addObject(Object obj)
	{
		System.out.println("Inside Template...");
		int result=0;
		
		Transaction tx=null;
		
		try {
			
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			
			session.save(obj);
			
			tx.commit();
			
			result=1;
			
		} catch (Exception e) {
		
			tx.rollback();
			
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static Object getObject(Class c,Serializable serializable)
	{
		Object obj=null;
		
		try {			
			return sessionFactory.openSession().get(c,serializable);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return obj;
	}
	

	
	public static Object getObjectByUserPass(String emailId,String password) {
	
	String queryString = "from Student where emailId = :emailId and password =:password";
	  Query query = sessionFactory.openSession().createQuery(queryString);
	  query.setString("emailId", emailId);
	  query.setString("password", password);
	  Object queryResult = query.uniqueResult();
	  Student student = (Student)queryResult;
	  return student;
	}
	
	
	public static Object getMentorObjectByUserPass(String emailId,String password) {
		
		String queryString = "from Mentor where emailId = :emailId and password =:password";
		  Query query = sessionFactory.openSession().createQuery(queryString);
		  query.setString("emailId", emailId);
		  query.setString("password", password);
		  Object queryResult = query.uniqueResult();
		  Mentor mentor = (Mentor)queryResult;
		  return mentor;
		}
		
	public static Object getObjectByEmail(String email) {
		
		String queryString = "from Student where email = :email";
		  Query query = sessionFactory.openSession().createQuery(queryString);
		  query.setString("email", email);
		  Object queryResult = query.uniqueResult();
		  //Employee employee = (Employee)queryResult;
		 // return employee; 
		  Student student = (Student)queryResult;
		  System.out.println(student.getStudentFirstName()); 
		  return student;
		}
	
	public static List<Object> getObjectListByQuery(String query)
	{
		return sessionFactory.openSession().createQuery(query).list();
	}
	
	public static int updateObject(Object obj)
	{
		int result=0;
		
		Transaction tx=null;
		
		try {
			
			Session session=sessionFactory.openSession();
			tx=session.beginTransaction();
			
			session.saveOrUpdate(obj);
			
			tx.commit();
			
			result=1;
			
		} catch (Exception e) {
		
			tx.rollback();
			
			e.printStackTrace();
		}
		
		return result;
	}
	
	/*public static int deleteObject(Class c,Serializable serializable)
	{
		int result=0;
		
		Session session=sessionFactory.openSession();
		
		Transaction tx=session.beginTransaction();
		
		try {
			
			Object obj=session.get(c,serializable);
			
			session.delete(obj);
			
			tx.commit();
			
			result=1;
						
		} catch (Exception e) {
			
			e.printStackTrace();
			
			tx.rollback();
		}
		
		return result;
	}*/

	public static List<Object> getObjectListByName(Class c, String columName, String value) {
		Session session=sessionFactory.openSession();
		  Criteria criteria = session.createCriteria(c);
			Criterion nameCriterion = Restrictions.eq(columName, value);
			criteria.add(nameCriterion);
			return criteria.list();
	}

	public static List getQuestionsListByName(String quizName) {
		String queryString = "from Quiz where quizName = :quizName";
		  Query query = sessionFactory.openSession().createQuery(queryString);
		  query.setString("quizName", quizName);
		  return query.list();
	}
	
	public static int getCredit(int subjectId,int studentId) {
		
		 String queryString = "from Credits where subjectId = :subjectId and studentId =:studentId";
		  Session session = sessionFactory.openSession();
		  Query query = session.createQuery(queryString);
		  query.setLong("subjectId", subjectId);
		  query.setLong("studentId", studentId);
		  Object queryResult = query.uniqueResult();
		  if(queryResult == null)
			  return 0;
		  else
			  return 1;
		  //Participants participant = (Participants)queryResult;
		  //session.close();
		  //return queryResult; 
   }

	public static List<QuizSub> getAllQuiz(String subjectName) {
			String queryString = "from QuizSub where subjectName1 = :subjectName";
			  Query query = sessionFactory.openSession().createQuery(queryString);
			  query.setString("subjectName", subjectName);
			  return query.list();
		}


	}

