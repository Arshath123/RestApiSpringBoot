package com.arshath.springBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.arshath.springBoot.Service.*;
import com.arshath.springBoot.entity.User;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//get all users
	@RequestMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	//get user by id
	@RequestMapping("/users/{id}")
	public User getUser(@PathVariable int id) {
		return userService.getUser(id);
	}
	
	//insert user
	@RequestMapping(method=RequestMethod.POST,value="/users")
	public User insertUser(@RequestBody User newUser) {
		return userService.insertUser(newUser);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/users")
	public User updateUser(@RequestBody User newUser) {
		return userService.updateUser(newUser);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/users/{id}")
	public void deleteUser(@PathVariable int id){
		userService.deleteUser(id);
	}
}
