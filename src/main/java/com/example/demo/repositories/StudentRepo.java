package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Students;

public interface StudentRepo extends JpaRepository<Students,Integer> {
	
	Students findByEmailAndPassword(String email, String password);
}
