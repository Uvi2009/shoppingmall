package com.Shopping.OrderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Shopping.Entity.*;
import com.Shopping.Repository.*;


import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrderService {

	//program for the service class
	
	
		//creating the instance for the service class through DI
		@Autowired
		private OrderRepository repo;
		
		public List<OrderEnity> findall(){
			return repo.findAll();
		}
		
		public OrderEnity get(Integer id)
		 {
		 return repo.findById(id).get();
		 }
		
		public void save(OrderEnity orderDetail)
		 {
		 repo.save(orderDetail);
		 }
		public void delete(Integer id)
		 {
		 repo.deleteById(id);
		 }
	
}
