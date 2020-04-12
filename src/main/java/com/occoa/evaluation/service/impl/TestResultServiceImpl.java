package com.occoa.evaluation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.occoa.evaluation.dao.TestResultDao;
import com.occoa.evaluation.service.TestResultService;

@Service
public class TestResultServiceImpl implements TestResultService {
	
	@Autowired
	private TestResultDao testResultDao;

}
