
package com.project.ims.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.project.ims.entity.User;
import com.project.ims.modelDto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	
	User save(UserRegistrationDto registrationDto);

}