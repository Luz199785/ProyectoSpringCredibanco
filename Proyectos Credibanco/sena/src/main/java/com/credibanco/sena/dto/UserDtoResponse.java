package com.credibanco.sena.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class UserDtoResponse { //De adentro hacia afuera 


	 
	    @JsonProperty("id")
	    private long id;

	    @JsonProperty("userName")
	    private String userName;
	    
	    @JsonProperty("password")
	    private String password;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

	
	 

	}

