package com.occoa.evaluation.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.occoa.evaluation.model.Option;

@Repository
public interface OptionDao extends CrudRepository<Option, Long> {

}
