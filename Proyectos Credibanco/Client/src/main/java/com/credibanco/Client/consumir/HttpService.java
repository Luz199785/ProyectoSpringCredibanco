package com.credibanco.Client.consumir;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.credibanco.Client.dto.UserDTO;

 

public class HttpService {

    private static final Logger logger = LoggerFactory.getLogger(HttpService.class);

    public static String consumirService() {

        UserDTO userDTO = new UserDTO();
        
        userDTO.setId(99);
        userDTO.setUserName("luz");
        userDTO.setPassword("234567");
        
        ResponseEntity<String> response = new RestTemplate().exchange
                ("http://localhost:8081/users/create",HttpMethod.POST,getHttpEntity(userDTO), String.class);

        if (response.getStatusCode() == HttpStatus.OK) {

            logger.info(response.getBody());
        } 

        return null;
    }

    private static HttpEntity getHttpEntity (UserDTO userDTO) {
        return new HttpEntity(userDTO, getHttpHeadersJson());
    }

    private static HttpHeaders getHttpHeadersJson () {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "application/json");

        return headers;
    }
}