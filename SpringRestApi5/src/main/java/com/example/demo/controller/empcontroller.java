package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.employee;
import com.example.demo.service.Daoservice;
@RestController
public class empcontroller {
	
	
	Daoservice ds;
	@Autowired
	public empcontroller(Daoservice ds)
	{
		this.ds=ds;
	}
	
	
	@GetMapping("/data")
	
	public List<employee> Findall()
	{
		return ds.Find();
		
	}
	
	@GetMapping("/get/{id}")
	public employee getid(@PathVariable int id)
	{
		return ds.findbyid(id);
	}
	@PostMapping("/save")
	public employee save(@RequestBody employee sp)
	{
		return ds.save(sp);
	}
	@PutMapping("/put")
	public employee update(@RequestBody employee pm )
	{
		return ds.update(pm);
		
		
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		ds.delete(id);
		return "sucess";
	}
	
	
	
	
	

}
