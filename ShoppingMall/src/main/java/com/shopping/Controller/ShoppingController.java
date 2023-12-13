package com.shopping.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.Entity.Mall;
import com.shopping.Service.ShoppingService;

@CrossOrigin(origins = "http://localhost:3000",methods = {
                RequestMethod.OPTIONS,
                RequestMethod.GET,
                RequestMethod.PUT,
                RequestMethod.DELETE,
                RequestMethod.POST
})
@RestController
public class ShoppingController {

	//program for the controller 

	//this is the class where the url are mapped 
	//with the localhost:8080
	
	
	//getting the service class through DI
	@Autowired
	ShoppingService service;
	
	
	//method for displaying all details
	@GetMapping("/customer-detail")
	public List<Mall> display() {
		return service.findAll();
	}
	
	
	//method for the particular detail
	@GetMapping("/customer-detail/{id}")
	public Mall findById(@PathVariable int id) {
		return service.get(id);
	}
	
	//insert the data into table
	@PostMapping("customer-detail/add")
	 public void add(@RequestBody Mall mallDetail)
	 {
	 service.save(mallDetail);
	 }
	
	//delete the data from the table
	@DeleteMapping("/customer-detail/{id}")
	 public void delete(@PathVariable Integer id)
	 {
	 service.delete(id);
	 }
	
	//update
	@PutMapping("/customer-detail/{id}")
	public void updateData(@PathVariable Integer id, @RequestBody Mall mall) {
		try {
		//Checks whether the data is exists
		Mall existMall = service.get(id);
		 service.save(mall); 
		}
		catch(Exception e) {
			
		}
	}
	@PatchMapping("/customer-detail/{id}")
	public void updateData1(@PathVariable Integer id, @RequestBody Mall mall) {
		try {
		 service.save(mall); 
		}
		catch(Exception e) {
			
		}
	}

	

}
