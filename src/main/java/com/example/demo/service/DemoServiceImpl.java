package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDemoDAO;
import com.example.demo.model.Detail;

@Service
public class DemoServiceImpl implements IDemoService {

	@Autowired
	private IDemoDAO dao;
	
	@Override
	public void signUp(Detail dtl) {
		dao.signUp(dtl);
	}

}
