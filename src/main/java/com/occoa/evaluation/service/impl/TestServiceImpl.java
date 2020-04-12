package com.occoa.evaluation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.occoa.evaluation.dao.TestDao;
import com.occoa.evaluation.model.Test;
import com.occoa.evaluation.service.TestService;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestDao testDao;

	@Override
	public void register(Test test) {
		testDao.save(test);
	}

	@Override
	public void update(Test test) {
		testDao.save(test);
	}

	@Override
	public List<Test> getAllByOwnerUserId(Long ownerUserId) {
		return testDao.findAllByOwnerUserId(ownerUserId);
	}

	@Override
	public List<Test> getAllByTesterUserId(Long testerUserId) {
		return testDao.findAllByTesterUserId(testerUserId);
	}

}
