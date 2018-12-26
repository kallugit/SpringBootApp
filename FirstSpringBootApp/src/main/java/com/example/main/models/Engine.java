package com.example.main.models;
import javax.persistence.*;



@Entity
@Table(name="Engine")
public class Engine {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String engine_type;
	
	private double price;

	public Integer getId() {
		return id;
	}

	public String getEngine_type() {
		return engine_type;
	}

	public double getPrice() {
		return price;
	}
	
}
