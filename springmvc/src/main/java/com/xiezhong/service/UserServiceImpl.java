package com.xiezhong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiezhong.entity.User;
import com.xiezhong.repository.UserRepository;

/**
 * @Title: TODO  
 * @Description: TODO  
 * @author: 谢忠
 * @date: 2014-8-20 下午9:43:22  
 *  
 */
@Service
public class UserServiceImpl  implements UserService {

	@Autowired
	private UserRepository userRepository;
	@Override
	public void createUser(User user) {
		
		userRepository.save(user);
		// TODO Auto-generated method stub
		
	}
	
	
	

}
