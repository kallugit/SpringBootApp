package com.example.main.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Body")
public class Body {

   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String body_type;
	
	private double price;

	public Integer getId() {
		return id;
	}

	public String getBody_type() {
		return body_type;
	}

	public double getPrice() {
		return price;
	}
	
	public void multiplyPrice(int times) {
		this.price=this.price*times;
	}
}
