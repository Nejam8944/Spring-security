package com.security.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "micro_user")
@Entity
public class User {

	@Id
	private String userId;
	private String name;
	private String email;
	private String about;
	@Transient
	private List<Rating> rating;
	
}
