package com.toast.rest.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.toast.rest.vo.EmployeeVO;

@Repository
public class LoginDAO {
	
	@Resource
	private SqlSessionTemplate sqlSession;
	
	public EmployeeVO selectLogin(EmployeeVO employeevo) {
		return sqlSession.selectOne("login.selectLogin", employeevo);
	}
	
}
