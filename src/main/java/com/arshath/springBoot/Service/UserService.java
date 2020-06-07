package com.arshath.springBoot.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arshath.springBoot.entity.User;
import com.arshath.springBoot.exception.ResourceNotFoundException;
import com.arshath.springBoot.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}

	public User getUser(int id) {
		return userRepository.findById(id)
				.orElseThrow(()->new ResourceNotFoundException("User Not Found with id: "+id ));
	}

	public User insertUser(User newUser) {
		return userRepository.save(newUser);
	}

	public User updateUser(User newUser) {
		return userRepository.save(newUser);
	}

	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
}
