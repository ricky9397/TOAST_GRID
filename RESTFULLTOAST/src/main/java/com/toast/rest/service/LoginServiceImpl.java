package com.toast.rest.service;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public int selectLogin(String id, String pw, HttpSession session) throws Exception {
		
		return 0;
	}

}
