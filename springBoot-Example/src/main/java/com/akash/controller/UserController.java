package com.akash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.akash.model.UserRecord;
import com.akash.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService userService;

	@GetMapping(value = "/allUsers")
	@ResponseBody
	public List<UserRecord> getAllUser() {
		return userService.getAllUsers();
	}

	@GetMapping(value = "/allUser",produces = "application/xml")
	@ResponseBody
	public List<UserRecord> getAllUsers() {
		return userService.getAllUser();
	}

	@PostMapping(value = "/addUser")
	@ResponseBody
	public UserRecord addUser(@RequestBody UserRecord userRecord) {
		return userService.addUser(userRecord);
	}
}
