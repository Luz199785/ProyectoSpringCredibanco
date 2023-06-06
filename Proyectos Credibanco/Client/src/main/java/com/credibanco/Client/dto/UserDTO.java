package com.credibanco.Client.dto;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDTO {

 

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