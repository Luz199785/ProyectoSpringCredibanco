
package com.credibanco.sena.service;

import com.credibanco.sena.dto.UserDtoRequest;
import com.credibanco.sena.dto.UserDtoResponse;

public interface IUserService {
	
	UserDtoResponse createUser (UserDtoRequest userDtoRequest); //Envio de lo que me llega
    UserDtoResponse readUser (long id);
    UserDtoResponse updateUser (UserDtoRequest userDtoRequest);
    UserDtoResponse deleteUser (long id);
}
