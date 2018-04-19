package com.ly.easy.user.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ly.easy.user.dto.User;
import com.ly.easy.user.service.UserHelloService;

@RestController
@EnableAutoConfiguration
@ComponentScan
@RequestMapping("/user/")
public class UserLoginController {

	@Autowired
	private UserHelloService userHelloService;

	@RequestMapping("hello")
	@ResponseBody
	public String helloToFirstMeet() {
		return "hello";
	}

	@RequestMapping("saveInfo")
	@ResponseBody
	public int savaUserInfo() {
		User user = new User();
		user.setAge(18);
		user.setUserName("赵日天");
		int res = userHelloService.save(user);
		return res;
	}

	@RequestMapping("queryInfo")
	@ResponseBody
	public List<User> queryAll() {
		return userHelloService.queryAll();
	}

}
