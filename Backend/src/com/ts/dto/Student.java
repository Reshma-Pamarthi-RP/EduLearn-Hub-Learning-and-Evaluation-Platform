package com.ts.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;




@XmlRootElement
@Entity
public class Student{
	@Id@GeneratedValue
	private int studentId;
	private String studentFirstName;
	private String studentLastName;
	private String password;
	private String emailId;
	private String institution;
	private String standard;
	
	/*@OneToMany(mappedBy="student",fetch = FetchType.LAZY)
	List<Test> testList =new ArrayList<Test>();
	
	@OneToMany(mappedBy="student",fetch = FetchType.LAZY)
	List<Material> materialList =new ArrayList<Material>();
	
	@OneToMany(mappedBy="student",fetch = FetchType.LAZY)
	List<TestResult> testResultList =new ArrayList<TestResult>();*/
	
	/*@OneToMany(mappedBy="student",fetch = FetchType.LAZY)
	List<MaterialDetails> materialDetailsList =new ArrayList<MaterialDetails>();
	
	@OneToMany(mappedBy="student",fetch = FetchType.LAZY)
	List<Subject> subjectList =new ArrayList<Subject>();*/
	
	
		

	public Student() {
		super();
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}
	
	/*public List<ItemDetails> getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(List<ItemDetails> itemDetails) {
		this.itemDetails = itemDetails;
	}*/

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFirstName=" + studentFirstName + ", studentLastName="
				+ studentLastName + ", password=" + password + ", emailId=" + emailId + ", institution=" + institution
				+ ", standard=" + standard + "]";
	}
	
	
	
}