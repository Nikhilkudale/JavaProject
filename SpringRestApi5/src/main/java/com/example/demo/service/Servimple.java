package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Dao;
import com.example.demo.entity.employee;

import jakarta.transaction.Transactional;
@Service
public class Servimple implements Daoservice {

	Dao d;
	@Autowired
	public Servimple(Dao d)
	{
		this.d=d;
	}
	
	@Override
	@Transactional

	public List<employee> Find() {
		// TODO Auto-generated method stub
		return d.Find();
	}

	@Override
	@Transactional

	public employee findbyid(int id) {
		// TODO Auto-generated method stub
		return d.findbyid(id);
	}

	@Override
	@Transactional

	public employee save(employee eps) {
		// TODO Auto-generated method stub
		return d.save(eps);
	}

	@Override
	@Transactional

	public void delete(int id) {
		d.delete(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional

	public employee update(employee eps) {
		d.save(eps);
		return null;
	}

}
