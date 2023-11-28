package com.Shopping.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_details")

public class OrderEnity {
	
	@Id
	private int orderId;
	@Column
	private int customer_id;
	@Column
	private int total;
	
	public OrderEnity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderEnity(int orderId, int customer_id, int total) {
		super();
		this.orderId = orderId;
		this.customer_id = customer_id;
		this.total = total;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}	
	
	
	
	

}
