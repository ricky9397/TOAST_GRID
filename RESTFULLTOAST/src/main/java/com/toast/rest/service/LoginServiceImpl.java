package com.toast.rest.service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.toast.rest.dao.LoginDAO;
import com.toast.rest.vo.EmployeeVO;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Resource
	private LoginDAO loginDAO;
	
	@Override
	public int selectLogin(EmployeeVO employeevo, HttpSession session) throws Exception {
		EmployeeVO vo = loginDAO.selectLogin(employeevo);
		int result = 0;
		if(vo != null) {
			session.setAttribute("loginSession", employeevo.getId());
			result = 1;
		} 
		return result;
	}

}
