package com.yedam.app.emp.mapper;

import java.util.List;

import com.yedam.app.emp.service.EmpVO;

public interface EmpMapper {
	//메소드 등록
	//조회
	public List<EmpVO> selectAllEmpList();
	//입력
	public int insertEmpInfo(EmpVO empVO);
	//단건 조회
	public EmpVO selectEmpInfo(int empId);
}
