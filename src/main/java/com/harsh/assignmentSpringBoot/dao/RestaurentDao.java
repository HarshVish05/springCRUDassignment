package com.harsh.assignmentSpringBoot.dao;

import com.harsh.assignmentSpringBoot.entity.Restaurent;
import org.springframework.data.repository.CrudRepository;

public interface RestaurentDao extends CrudRepository<Restaurent,Integer> {
}
