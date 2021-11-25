package com.toast.rest.service;

import javax.servlet.http.HttpSession;

public interface LoginService {

	int selectLogin(String id, String pw, HttpSession session) throws Exception;

}
