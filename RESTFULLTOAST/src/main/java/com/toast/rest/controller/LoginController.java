package com.toast.rest.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.toast.rest.service.LoginService;
import com.toast.rest.vo.EmployeeVO;

@RestController
public class LoginController {
	
	@Resource
	private LoginService loginService;
	
	/**
	 * 로그인
	 * @param employeevo
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "login.do", method = RequestMethod.POST)
	public int Login(EmployeeVO employeevo, HttpSession session) throws Exception {
		
		int result = loginService.selectLogin(employeevo, session);
		
		return result;
	}
	
}
