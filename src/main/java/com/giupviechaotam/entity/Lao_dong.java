package com.giupviechaotam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Lao_dong {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String first_name;
	
	@Column
	private String last_name;
	
	@Column
	private String middle_name;
	
	@Column
	private String phone_number;
	
	@Column
	private String address;
	
	@Column
	private String identity_number;

	
}
