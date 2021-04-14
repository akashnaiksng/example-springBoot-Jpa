package com.akash.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.model.UserRecord;
import com.akash.repository.UserRepository;


@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	public List<UserRecord> getAllUsers() {
		List<UserRecord> obj=new ArrayList<UserRecord>();
		repo.findAll().forEach(obj::add);
//		for (UserRecord userRecord : obj) {
//			System.out.println(userRecord);
//		}
		return obj;
	}
	

	public List<UserRecord> getAllUser() {
		System.out.println("this method is executed");
		return (List<UserRecord>) repo.findAll();
	}
	
	public UserRecord addUser(UserRecord user) {
		repo.save(user);
		return user;
	}
}
