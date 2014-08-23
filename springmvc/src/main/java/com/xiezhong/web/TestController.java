package com.xiezhong.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Title: TODO  
 * @Description: TODO  
 * @author: 谢忠
 * @date: 2014-8-20 下午9:25:36  
 *  
 */
@Controller
public class TestController {

	@RequestMapping(value="test.html")
	public String test(){
		
		return  "test";
	}
	
}
