package com.ly.easy.user.service;

import java.util.List;

import com.ly.easy.user.dto.User;

public interface UserHelloService {
	
	User selectById(Integer id);
	
	int save(User user);
	
	List<User> queryAll();

}
