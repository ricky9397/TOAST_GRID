package com.toast.rest.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.toast.rest.service.LoginService;

@RestController
public class LoginController {
	
	@Resource
	private LoginService loginService;
	
	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public int Login(@RequestParam("id") String id, @RequestParam("pw") String pw, HttpSession session) throws Exception {
		return loginService.selectLogin(id, pw, session);
	}
	
}
