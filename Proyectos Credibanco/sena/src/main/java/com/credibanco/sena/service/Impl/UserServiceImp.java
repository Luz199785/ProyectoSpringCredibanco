package com.credibanco.sena.service.Impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.sena.dto.UserDtoRequest;
import com.credibanco.sena.dto.UserDtoResponse;
import com.credibanco.sena.entity.User;
import com.credibanco.sena.repository.IUserRepository;
import com.credibanco.sena.service.IUserService;

@Service
public class UserServiceImp implements IUserService{
	@Autowired
	IUserRepository userRepositoy;
	
	Logger logger = LoggerFactory.getLogger(UserServiceImp.class);

	
	@Override
	public UserDtoResponse createUser(UserDtoRequest userDtoRequest) {
		logger.info("---Llego al service");
		
		User user = new User();
		user.setId(userDtoRequest.getId());
		user.setUserName(userDtoRequest.getUserName());
		user.setPassword(userDtoRequest.getPassword());
		user = userRepositoy.save(user);
		
		logger.info("---Registro en la base de datos---");
		
		UserDtoResponse userResponsive = new UserDtoResponse();
		userResponsive.setId(user.getId());
		userResponsive.setUserName(user.getUserName());
		userResponsive.setPassword(user.getPassword());
		
		logger.info("---Termino el proceso del service---");
		
		return userResponsive;
	
	}

	@Override
	public UserDtoResponse readUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDtoResponse updateUser(UserDtoRequest userDtoRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDtoResponse deleteUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
