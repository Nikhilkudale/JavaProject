package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.employee;

public interface Dao {
	
	public List<employee> Find();
	public employee findbyid(int id);
	public employee save(employee eps);
	public void delete(int id);
	

}
