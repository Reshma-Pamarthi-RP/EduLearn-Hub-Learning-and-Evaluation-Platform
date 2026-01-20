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
public class QuizSub{
	@Id@GeneratedValue
	private int quizId;
	public int getQuizId() {
		return quizId;
	}
	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}
	private String quizName1;
	private String subjectName1;
	
	public String getQuizName1() {
		return quizName1;
	}
	public void setQuizName1(String quizName1) {
		this.quizName1 = quizName1;
	}
	public String getSubjectName1() {
		return subjectName1;
	}
	public void setSubjectName1(String subjectName1) {
		this.subjectName1 = subjectName1;
	}
	@Override
	public String toString() {
		return "QuizSub [quizId=" + quizId + ", quizName1=" + quizName1 + ", subjectName1=" + subjectName1 + "]";
	}
	
	
}

