package com.toast.rest.service;

import javax.servlet.http.HttpSession;

import com.toast.rest.vo.EmployeeVO;

public interface LoginService {


	/**
	 * 로그인
	 * @param employeevo
	 * @param session
	 * @return
	 * @throws Exception
	 */
	int selectLogin(EmployeeVO employeevo, HttpSession session) throws Exception;

}
