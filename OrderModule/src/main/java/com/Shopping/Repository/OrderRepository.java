package com.Shopping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Shopping.Entity.OrderEnity;

public interface OrderRepository extends JpaRepository<OrderEnity, Integer> {

}
