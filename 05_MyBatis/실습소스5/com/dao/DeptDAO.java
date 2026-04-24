package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.DeptDTO;

public class DeptDAO {

	//전체 Emp 목록 반환
	public List<DeptDTO> findAll(SqlSession session){
		List<DeptDTO> list = 
				session.selectList("com.config.DeptMapper.findAll");
		return list;
	}
}
