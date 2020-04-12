package com.occoa.evaluation.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.occoa.evaluation.dao.OptionDao;
import com.occoa.evaluation.service.OptionService;

@Service
public class OptionServiceImpl implements OptionService {
	
	@Autowired
	private OptionDao optionDao;

}
