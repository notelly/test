package com.yedam.app.emp.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class EmpVO {
	int employeeId;
	String firstName;
	String lastName;
	String email;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	Date hireDate;
	//기본 포맷은 yyyy/MM/dd input에서 쓰는 건 -을 사용
	//이걸 맞춰주기 위해 Date 어노테이션을 사용한다.
	String jobId;
	int departmentId;
	
}
