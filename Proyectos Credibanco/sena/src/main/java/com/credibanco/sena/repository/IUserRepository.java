package com.credibanco.sena.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credibanco.sena.entity.User;

public interface IUserRepository extends JpaRepository<User, Long>{
	

}
