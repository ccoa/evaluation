package com.occoa.evaluation.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.occoa.evaluation.model.TestResult;

@Repository
public interface TestResultDao extends CrudRepository<TestResult, Long> {

}
