package com.example.demo;

import org.springframework.batch.item.ItemProcessor;

import com.example.demo.Bean.User;

public class UserItemProcessor implements ItemProcessor<User, User>{
	
	@Override
	 public User process(User user) throws Exception {
	
	  return user;
	 }

}
