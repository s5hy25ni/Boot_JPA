package com.min.edu.vo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name="CAR")
@Entity
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) private Long id;
	
	@Column(name="BRAND")
	private String brand;
	@Column(name="MODEL")
	private String model;
	@Column(name="COLOR")
	private String color;
	@Column(name="REGISTERNUMBER")
	private String registerNumber;
	
	@Column(name="PRODUCTYEAR")
	private Integer productYear;
	@Column(name="PRICE")
	private Integer price;
	
	public Car(String brand, String model, String color, String registerNumber, Integer productYear, Integer price, Owner owner) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.registerNumber = registerNumber;
		this.productYear = productYear;
		this.price = price;
		this.owner = owner;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="owner")
	private Owner owner;
	
//	@ManyToMany(mappedBy = "cars")
//	private Set<Owner> owners = new HashSet<Owner>();
	
	
}
