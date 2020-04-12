package com.occoa.evaluation.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_question")
public class Question implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String OPTION_TYPE_MULTIPLE = "M";
	public static final String OPTION_TYPE_UNIQUE = "U";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ques_id")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "test_id")
	private Test test;
	
	@Column(name = "ques_descr")
	private String description;
	
	@Column(name = "ques_otype")
	private String optionType;
	
	@Column(name = "ques_detai")
	private String detail;
	
	@Column(name = "ques_score")
	private Double score;
	
	@Column(name = "ques_infor")
	private String information;
	
	@Column(name = "ques_numbe")
	private Integer number;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
	
	

}
