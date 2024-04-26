package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
@Repository
public class Daoimple implements Dao {

	EntityManager em;
	@Autowired
	public Daoimple(EntityManager em)
	{
		this.em=em;
	}
	@Override
	public List<employee> Find() 
	
	{
		TypedQuery<employee> tp=em.createQuery("from employee",employee.class);
		List<employee> emp=tp.getResultList();
		return emp;
	}
	@Override
	public employee findbyid(int id) {
		// TODO Auto-generated method stub
		
		return em.find(employee.class, id);
	}
	@Override
	public employee save(employee eps) {
		// TODO Auto-generated method stub
		employee ref =em.merge(eps);
		return ref;
	}
	@Override
	public void delete(int id) {
		employee ref=em.getReference(employee.class, id);
		em.remove(ref);
		
	}

}
