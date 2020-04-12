package com.occoa.evaluation.service;

import java.util.List;

import com.occoa.evaluation.model.Test;

public interface TestService {

	void register(Test test);
	
	void update(Test test);
	
	List<Test> getAllByOwnerUserId(Long ownerUserId);
	
	List<Test> getAllByTesterUserId(Long testerUserId);
	
}
