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
public class Subject{
	@Id@GeneratedValue
	private int subjectId;
	private String subjectName;
	
	/*@ManyToOne
	@JoinColumn(name="studentId")
	private Student student;
	
	@OneToMany(mappedBy="subject",fetch = FetchType.LAZY)
	List<Quiz> quizList =new ArrayList<Quiz>();*/

	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", subjectName=" + subjectName + "]";
	}



}
