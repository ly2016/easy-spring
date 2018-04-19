package com.ly.easy.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ly.easy.user.dto.User;
import com.ly.easy.user.mapper.UserMapper;
import com.ly.easy.user.service.UserHelloService;

@Component
public class UserHelloServiceImpl implements UserHelloService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User selectById(Integer id) {
		return userMapper.selectById(id);
	}

	@Override
	public int save(User user) {
		return userMapper.save(user);
	}

	@Override
	public List<User> queryAll() {
		// TODO Auto-generated method stub
		return userMapper.queryAll();
	}

}
