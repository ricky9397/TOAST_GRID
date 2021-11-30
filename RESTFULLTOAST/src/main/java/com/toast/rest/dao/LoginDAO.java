package com.toast.rest.dao;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.toast.rest.vo.EmployeeVO;

@Repository
public class LoginDAO {
	
	@Resource
	private SqlSession sqlSession;
	
	public EmployeeVO selectLogin(EmployeeVO employeevo) {
		return sqlSession.selectOne("login.selectLogin", employeevo);
	}
	
}
