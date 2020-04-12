package com.occoa.evaluation.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.occoa.evaluation.model.Test;

@Repository
public interface TestDao extends CrudRepository<Test, Long> {
	
	List<Test> findAllByOwnerUserId(Long ownerUserId);
	
	List<Test> findAllByTesterUserId(Long ownerUserId);

}
