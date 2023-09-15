package com.signup.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Component
@Data
@Entity
public class User {
	@Id
	
	private int id;
	@NotBlank(message = "User Name Should Not Be Balnk")
	private String name;
	private String userid;
//	@Email(regexp = "[a-zA-Z0-9+_.-+@gmail+[.]+com",message = "Invalid Email --Should be In the Extension of @gmail.com")
	private String email;
	@Min(value = 6000000000l,message = "Phone Number Cannot Start Below '6'!!")
	@Max(value = 9999999999l,message = "Phone Number Cannot Start Above '9'!!")
	private long phno;
	private String pwd;
	private String confirmpwd;

}

/*
 
     1) @NotNull
     2) @NotBlank --->""-->empty String 
     3) @Notmpty ---> It is a Combination of @NotNull And @NotBlank
     4) @Min
     5) @Max
     6) @Email(regex Expression) for validation
     7) @Pattern(regex Expression) for validation and for Specific Pattern 
*/