package com.ts.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import com.ts.db.HibernateTemplate;
import com.ts.dto.Mentor;

public class MentorDAO {

	private SessionFactory factory = null;

	public static Mentor getMentorByUserPass(String emailId,String password) {

		return (Mentor)HibernateTemplate.getMentorObjectByUserPass(emailId,password);
	}

	public int register(Mentor mentor) {
		System.out.println("DAO"+mentor); 
		return HibernateTemplate.addObject(mentor);
	}

	public List<Mentor> getAllMentors() {
		List<Mentor> mentors=(List)HibernateTemplate.getObjectListByQuery("From Mentor");
		System.out.println("Inside All Mentors ..."+mentors);
		return mentors;
	}

	public Mentor getMentor(int id) {
		return (Mentor)HibernateTemplate.getObject(Mentor.class,id);
	}

	/*public void getStudents(int studentId) {
		String query= "from Student where studentId = 1";
		System.out.println("get students is called...");
		List<Object> obj = (List<Object>) HibernateTemplate.getObjectListByQuery(query);
		System.out.println("Testing get students :" + obj); 
		for(Object student: obj){
			Student student = (Student)student;
			System.out.println(student.getStudentFirstName());
		}*/

	/*public  Employee getEmpByEmail(String email) {
		return (Employee)HibernateTemplate.getObjectByEmail(email);
	}*/
	
	public static Mentor getMentorByEmail(String email){
	 return (Mentor)HibernateTemplate.getObjectByEmail(email);
	}
}


