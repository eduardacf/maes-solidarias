package com.tcc.maes_solidarias.service;

import com.tcc.maes_solidarias.entity.User;
import com.tcc.maes_solidarias.repository.UserRepository;
import com.tcc.maes_solidarias.repository.UserroleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Autowired
	UserroleRepository userRoleRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;


	@Override
	public User findByusername(String username) {
		return userRepository.findByusername(username);
	}


	@Override
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRole(userRoleRepository.findByName("USER"));
		userRepository.save(user);
	}

}
