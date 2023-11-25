package com.shopping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.Entity.Mall;
import com.shopping.Repository.ShoppingRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ShoppingService {
	
	//program for the service class
	
	
	//creating the instance for the service class through DI
	@Autowired
	private ShoppingRepository repo;
	
	//finding all the data 
	public List<Mall> findAll(){
	
		return repo.findAll();
	}
	
	//for a particular data
	public Mall get(Integer id)
	 {
	 return repo.findById(id).get();
	 }
	
	//inserting the data
	public void save(Mall mallDetail)
	 {
	 repo.save(mallDetail);
	 }
	
	//deleting the data
	public void delete(Integer id)
	 {
	 repo.deleteById(id);
	 }
}
