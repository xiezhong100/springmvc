package com.xiezhong.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xiezhong.entity.User;
import com.xiezhong.service.UserService;

/**
 * @Title: TODO  
 * @Description: TODO  
 * @author: 谢忠
 * @date: 2014-8-20 下午9:44:22  
 *  
 */
@Controller
public class UserController {

	@Autowired
	private  UserService userService;
	
	@RequestMapping(value="user/register.do") 
	public String register() {
		return "user/register";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView createUser(User user) {
		userService.createUser(user);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/createSuccess");
		mav.addObject("user", user);
		return mav;
	}
	
	
	@RequestMapping(value="create.html")
	public String createUser(){
		User user = new User();
		user.setUserName("xiezhong");
		user.setPassword("xiezhong");
		user.setRealName("xiezhong");
		userService.createUser(user);
		return "success";
	}
	
	public void test() {
		Thread aThread = new Thread(Thread.currentThread());
	}
}
