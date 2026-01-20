package com.ts.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

//import com.rest.dto.Employee;
import com.ts.dto.Student;
import com.ts.db.HibernateTemplate;

public class StudentDAO {

	private SessionFactory factory = null;

	public static Student getStudentByUserPass(String emailId,String password) {

		return (Student)HibernateTemplate.getObjectByUserPass(emailId,password);
	}

	public int register(Student student) {
		System.out.println("DAO"+student); 
		return HibernateTemplate.addObject(student);
	}

	public List<Student> getAllStudents() {
		List<Student> students=(List)HibernateTemplate.getObjectListByQuery("From Student");
		System.out.println("Inside All Students ..."+students);
		return students;
	}

	public Student getStudent(int id) {
		return (Student)HibernateTemplate.getObject(Student.class,id);
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
	
	public static Student getStudentByEmail(String email){
	 return (Student)HibernateTemplate.getObjectByEmail(email);
	}
}

