package com.occoa.evaluation.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.occoa.evaluation.model.Question;

@Repository
public interface QuestionDao extends CrudRepository<Question, Long> {

}
