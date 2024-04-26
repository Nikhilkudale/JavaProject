package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.employee;

public interface Daoservice {
	public List<employee> Find();
	public employee findbyid(int id);
	public employee save(employee eps);
	public employee update(employee eps);

	public void delete(int id);

}
