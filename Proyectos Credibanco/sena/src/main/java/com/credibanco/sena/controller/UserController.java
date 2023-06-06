package com.credibanco.sena.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credibanco.sena.dto.UserDtoRequest;
import com.credibanco.sena.dto.UserDtoResponse;
import com.credibanco.sena.service.Impl.UserServiceImp;

@RestController
@RequestMapping ("users")
public class UserController {
	
	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	
	UserServiceImp userServiceImpl;
	
	@PostMapping (value = "/create",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> createUser (@RequestBody UserDtoRequest userDtoRequest){
		logger.info("---HttpRequest create User---");
		
		UserDtoResponse userDtoResponse = userServiceImpl.createUser(userDtoRequest);
		
		logger.info("---Finalizo la petición---");
		return ResponseEntity.ok(userDtoResponse);
	}
}
