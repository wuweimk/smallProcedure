package com.mk.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户
 * @author Administrator
 *
 */
@RestController
public class UserController {

	@RequestMapping("/hello") 
	@ResponseBody 
	public Map<String, Object> showHelloWorld(){
			Map<String, Object> map = new HashMap<>();
			map.put("msg", "HelloWorld"); 
			map.put("msg", "HelloWorld"); //添加 
			return map; 
		}
	
	@PostMapping("/login")
	public <T> void login(HttpServletRequest req,HttpServletResponse res,HttpSession session){
		
	}
	
	
}
