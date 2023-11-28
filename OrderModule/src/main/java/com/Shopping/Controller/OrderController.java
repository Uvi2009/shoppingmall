package com.Shopping.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Shopping.Entity.*;
import com.Shopping.OrderService.*;


@RestController
public class OrderController {
	//program for the controller 

		//this is the class where the url are mapped 
		//with the localhost:8080
		
		
		//getting the service class through DI
		@Autowired
		OrderService service;
		
		
//		//method for displaying all details
//		@GetMapping("/orderDetail")
//		public List<OrderEnity> display() {
//			return service.findall();
//		}
		
		@GetMapping("/order-details")
		public List<OrderEnity> display(){
			return service.findall();
		}
		
		
		//method for the particular detail
		@GetMapping("/orderDetail/{id}")
		public OrderEnity findById(@PathVariable int id) {
			return service.get(id);
		}
		
		//insert the data into table
		@PostMapping("orderDetail/add")
		 public void add(@RequestBody OrderEnity orderDetail)
		 {
		 service.save(orderDetail);
		 }
		
		//delete the data from the table
		@DeleteMapping("/orderDetail/{id}")
		 public void delete(@PathVariable Integer id)
		 {
		 service.delete(id);
		 }
		
		//update
		@PutMapping("/orderDetail/{id}")
		public void updateData(@PathVariable Integer id, @RequestBody OrderEnity order) {
			try {
			//Checks whether the data is exists
			OrderEnity existOrder = service.get(id);
			 service.save(order); 
			}
			catch(Exception e) {
				
			}
		}

}
