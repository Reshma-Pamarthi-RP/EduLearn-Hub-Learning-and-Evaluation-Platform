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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
public class Mentor{
	@Id@GeneratedValue
	private int mentorId;
	private String mentorFirstName;
	private String mentorLastName;
	private String password;
	private String emailId;
	private String phoneNo;
	private String qualification;
	private String profession;
	
	/*@OneToMany(mappedBy="mentor",fetch = FetchType.LAZY)
	List<QuestionPaper> questionPaperList =new ArrayList<QuestionPaper>();
	
	@OneToMany(mappedBy="mentor",fetch = FetchType.LAZY)
	List<Material> materialList =new ArrayList<Material>();*/

	public Mentor() {
		super();
	}

	public int getMentorId() {
		return mentorId;
	}

	public void setMentorId(int mentorId) {
		this.mentorId = mentorId;
	}

	public String getMentorFirstName() {
		return mentorFirstName;
	}

	public void setMentorFirstName(String mentorFirstName) {
		this.mentorFirstName = mentorFirstName;
	}

	public String getMentorLastName() {
		return mentorLastName;
	}

	public void setMentorLastName(String mentorLastName) {
		this.mentorLastName = mentorLastName;
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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	@Override
	public String toString() {
		return "Mentor [mentorId=" + mentorId + ", mentorFirstName=" + mentorFirstName + ", mentorLastName="
				+ mentorLastName + ", password=" + password + ", emailId=" + emailId + ", phoneNo=" + phoneNo
				+ ", qualification=" + qualification + ", profession=" + profession + "]";
	}
	
	
	
}

