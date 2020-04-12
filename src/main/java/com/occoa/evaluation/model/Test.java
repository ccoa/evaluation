package com.occoa.evaluation.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_test")
public class Test implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final String STATUS_ACTIVE = "A";
	public static final String STATUS_INACTIVE = "A";
	public static final String STATUS_FINISHED = "A";
	public static final String STATUS_DELETED = "A";
	
	public static final String ANSWER_TYPE_UNIQUE = "U";
	public static final String ANSWER_TYPE_MULTIPLE = "M";
	
	public static final String RESULT_TYPE_GENERAL = "G";
	public static final String RESULT_TYPE_SHOW_QUESTION = "S";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "test_id")
	private Long id;
	
	@Column(name = "test_name")
	private String name;
	
	@Column(name = "test_descr")
	private String description;
	
	@Column(name = "test_statu")
	private String status;
	
	@Column(name = "test_atype")
	private String answerType;
	
	@Column(name = "test_regis")
	private Date registerDateTime;
	
	@Column(name = "test_lmodi")
	private Date modificationDateTime;
	
	@Column(name = "user_idown")
	private Long ownerUserId;
	
	@Column(name = "user_idtes")
	private Long testerUserId;
	
	@Column(name = "test_durat")
	private Long duration;
	
	@Column(name = "test_image")
	private String imageUrl;
	
	@Column(name = "test_phone")
	private String phoneContact;
	
	@Column(name = "test_email")
	private String emailContact;
	
	@Column(name = "test_deadl")
	private Date deadline;
	
	@Column(name = "test_rtype")
	private String resultType;
	
	@Column(name = "test_nques")
	private Integer numberQuestions;
	
	@Column(name = "test_sdiff")
	private Boolean differentScoreQuestion ;
	
	@Column(name = "test_score")
	private Double scoreQuestion;
	
	@Column(name = "test_snega")
	private Double negativeScoreQuestion;
	
	@Column(name = "test_smini")
	private Double scoreMinimum;
	
	@Column(name = "test_publi")
	private Boolean publicTest;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAnswerType() {
		return answerType;
	}

	public void setAnswerType(String answerType) {
		this.answerType = answerType;
	}

	public Date getRegisterDateTime() {
		return registerDateTime;
	}

	public void setRegisterDateTime(Date registerDateTime) {
		this.registerDateTime = registerDateTime;
	}

	public Date getModificationDateTime() {
		return modificationDateTime;
	}

	public void setModificationDateTime(Date modificationDateTime) {
		this.modificationDateTime = modificationDateTime;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getPhoneContact() {
		return phoneContact;
	}

	public void setPhoneContact(String phoneContact) {
		this.phoneContact = phoneContact;
	}

	public String getEmailContact() {
		return emailContact;
	}

	public void setEmailContact(String emailContact) {
		this.emailContact = emailContact;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public String getResultType() {
		return resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	public Integer getNumberQuestions() {
		return numberQuestions;
	}

	public void setNumberQuestions(Integer numberQuestions) {
		this.numberQuestions = numberQuestions;
	}

	public Boolean getDifferentScoreQuestion() {
		return differentScoreQuestion;
	}

	public void setDifferentScoreQuestion(Boolean differentScoreQuestion) {
		this.differentScoreQuestion = differentScoreQuestion;
	}

	public Double getScoreQuestion() {
		return scoreQuestion;
	}

	public void setScoreQuestion(Double scoreQuestion) {
		this.scoreQuestion = scoreQuestion;
	}

	public Double getNegativeScoreQuestion() {
		return negativeScoreQuestion;
	}

	public void setNegativeScoreQuestion(Double negativeScoreQuestion) {
		this.negativeScoreQuestion = negativeScoreQuestion;
	}

	public Double getScoreMinimum() {
		return scoreMinimum;
	}

	public void setScoreMinimum(Double scoreMinimum) {
		this.scoreMinimum = scoreMinimum;
	}

	public Long getOwnerUserId() {
		return ownerUserId;
	}

	public void setOwnerUserId(Long ownerUserId) {
		this.ownerUserId = ownerUserId;
	}

	public Long getTesterUserId() {
		return testerUserId;
	}

	public void setTesterUserId(Long testerUserId) {
		this.testerUserId = testerUserId;
	}

	public Boolean getPublicTest() {
		return publicTest;
	}

	public void setPublicTest(Boolean publicTest) {
		this.publicTest = publicTest;
	}
	
}
