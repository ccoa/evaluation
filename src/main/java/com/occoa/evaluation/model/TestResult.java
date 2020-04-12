package com.occoa.evaluation.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_test_result")
public class TestResult implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String STATUS_ACTIVE = "A";
	public static final String STATUS_INACTIVE = "I";
	public static final String STATUS_FINISHED = "F";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tres_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "test_id")
	private Test test;
	
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "tres_regis")
	private Date registerDateTime;
	
	@Column(name = "tres_corre")
	private Integer correctNumber;
	
	@Column(name = "tres_incor")
	private Integer incorrectNumber;
	
	@Column(name = "tres_score")
	private Double score;
	
	@Column(name = "tres_statu")
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getRegisterDateTime() {
		return registerDateTime;
	}

	public void setRegisterDateTime(Date registerDateTime) {
		this.registerDateTime = registerDateTime;
	}

	public Integer getCorrectNumber() {
		return correctNumber;
	}

	public void setCorrectNumber(Integer correctNumber) {
		this.correctNumber = correctNumber;
	}

	public Integer getIncorrectNumber() {
		return incorrectNumber;
	}

	public void setIncorrectNumber(Integer incorrectNumber) {
		this.incorrectNumber = incorrectNumber;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
