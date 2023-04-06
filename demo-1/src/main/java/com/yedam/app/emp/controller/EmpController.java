package com.yedam.app.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;

@Controller
public class EmpController {
	@Autowired
	EmpService empService;
	
	//@RequestMapping("/empList")
	@RequestMapping(value ="/empList", method=RequestMethod.GET)
	//@GetMapping("empList") : 위와 같은 의미
	public String empAllList(Model model) {
		model.addAttribute("empList", empService.getAllList());
		//controller 에서 사용가능한건 service만 가능 mapper 불가능
		return "empList";
	}
	
	//insert >> 하나의 페이지에 두개의 기능을 처리 get방식을 기반으로 접근
	//입력을 받을 페이지 >> 페이지 호출
	@GetMapping("/empInsert") 
	public String inputEmpInfo(){
		
		
		return "empInsert";
		
	}	
	//get parameter를 다 끌고 올 필요가 없다.
	//class를 가지고 오면됨
	//입력 받은 것을 처리 >> 실제 동작
	@PostMapping("/empInsert")
	//비동기 통신을 기반으로 처리할 예정
	public String inputEmpProcess(EmpVO empVO) {
		empService.insertEmpInfo(empVO);
		return "redirect:empList"; //return에 redirect: 해당 컨트롤러로 향함
	}
}
