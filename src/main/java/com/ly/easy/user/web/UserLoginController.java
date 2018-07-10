package com.ly.easy.user.web;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ly.easy.user.dto.User;
import com.ly.easy.user.service.UserHelloService;

//@RestController
/*@EnableAutoConfiguration
@ComponentScan*/
@Controller
@RequestMapping("/user/")
public class UserLoginController {
	
	private static final Logger LOG = LoggerFactory.getLogger(UserLoginController.class);
	@Autowired
	private UserHelloService userHelloService;

	@RequestMapping("hello")
	@ResponseBody
	public String helloToFirstMeet() {
		LOG.info("hello");
		return "hello";
	}

	@RequestMapping(value = "saveInfo", method = RequestMethod.GET)
	@ResponseBody
	public String savaUserInfo(@Param(value = "age") int age, @Param(value = "name") String name) {
		User user = new User();
		user.setAge(age);
		user.setUserName(name);
		userHelloService.save(user);
		return user.toString();
	}

	@RequestMapping("queryInfo")
	@ResponseBody
	public List<User> queryAll() {
		return userHelloService.queryAll();
	}

	@RequestMapping("getUsers")
	public String listStudent(Model model) {
		List<User> users = userHelloService.queryAll();
		model.addAttribute("users", users);
		return "showUser";
	}

}
