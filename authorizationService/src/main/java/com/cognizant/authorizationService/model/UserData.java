package com.cognizant.authorizationService.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Entity
@Table(name = "userdata")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserData {

	@Id
	@Column(name = "userId")
	private String userid;

	@Column(name = "userPassword")
	private String upassword;

	@Column(name = "userName")
	private String uname;

	private String authToken;


}
