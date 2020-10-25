package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Detail;
import com.example.demo.repo.DemoRepository;

@Repository
public class DemoDAOImpl implements IDemoDAO {

	@Autowired
	private DemoRepository repo;
	
	@Override
	public void signUp(Detail dtl) {
		repo.save(dtl);
	}
}
