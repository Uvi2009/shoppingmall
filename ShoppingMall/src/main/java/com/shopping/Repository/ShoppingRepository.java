package com.shopping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.Entity.Mall;

public interface ShoppingRepository extends JpaRepository<Mall, Integer>{
	
	//program for the repository class
	//since we are extending the JpaRepository class , methods where used from them

}
