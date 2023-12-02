package com.example.swesurvey;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Srepository extends JpaRepository<Smodel, Integer> {
	List<Smodel> findAll();
	Smodel findById(int id);
	int deleteById(int id);
	
}