package com.ts.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
public class TestResult{
	@Id@GeneratedValue
	private int testId;
	private int studentId;
	private int correctAnsCount;
	private int score;
	
	/*@ManyToOne
	@JoinColumn(name="studentId")
	private Student student;
	
	@OneToOne
	@JoinColumn(name="testId")
	private Test test;*/
	

	public TestResult() {
		super();
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getCorrectAnsCount() {
		return correctAnsCount;
	}

	public void setCorrectAnsCount(int correctAnsCount) {
		this.correctAnsCount = correctAnsCount;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "TestResult [testId=" + testId + ", studentId=" + studentId + ", correctAnsCount=" + correctAnsCount
				+ ", score=" + score + "]";
	}
	
	
	
}

