package com.heroes.main.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heroes.main.models.Power;

@Repository
public interface PowerRepo extends CrudRepository<Power, Long> {
	List<Power> findAll();

}
