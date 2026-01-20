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
public class QuestionPaper{
	@Id@GeneratedValue
	private int testId;
	private int questionId;
	
	/*@ManyToOne
	@JoinColumn(name="mentorId")
	private Mentor mentor;
	
	@OneToMany(mappedBy="questionPaper",fetch = FetchType.LAZY)
	List<Question> questionList =new ArrayList<Question>();
	
	@ManyToOne
	@JoinColumn(name="testId")
	private Test test;*/

	public QuestionPaper() {
		super();
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	@Override
	public String toString() {
		return "QuestionPaper [testId=" + testId + ", questionId=" + questionId + "]";
	}
	
	
	
}
