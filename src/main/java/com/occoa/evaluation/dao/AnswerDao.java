package com.occoa.evaluation.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.occoa.evaluation.model.Answer;

@Repository
public interface AnswerDao extends CrudRepository<Answer, Long> {

}
