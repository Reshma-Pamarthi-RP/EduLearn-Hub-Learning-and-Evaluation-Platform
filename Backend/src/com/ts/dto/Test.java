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
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
public class Test{
	@Id@GeneratedValue
	private int testId;
	private String testName;
	private Date date;
	private String startingTime;
	private String endingTime;
	private int totalScore;
	
	/*@ManyToOne
	@JoinColumn(name="studentId")
	private Student student;
	
	@OneToMany(mappedBy="test",fetch = FetchType.LAZY)
	List<QuestionPaper> questionPaperList =new ArrayList<QuestionPaper>();
	
	@OneToOne
	@JoinColumn(name="testId")
	private TestResult testResult;*/
	

	public Test() {
		super();
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStartingTime() {
		return startingTime;
	}

	public void setStartingTime(String startingTime) {
		this.startingTime = startingTime;
	}

	public String getEndingTime() {
		return endingTime;
	}

	public void setEndingTime(String endingTime) {
		this.endingTime = endingTime;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	@Override
	public String toString() {
		return "Test [testId=" + testId + ", testName=" + testName + ", date=" + date + ", startingTime=" + startingTime
				+ ", endingTime=" + endingTime + ", totalScore=" + totalScore + "]";
	}
	
	
	
}
