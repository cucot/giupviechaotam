package com.giupviechaotam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "LAO_DONG")
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
