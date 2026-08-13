package com.yonsai.Day58_20260813.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String main() {
		return "redirect:index.html";
	}
    
	@GetMapping("/about")
	public String about() {
		return "redirect:about.html";
	}
	
}

/*
 * Agent - 나 대신 일해주는 기계
 * 
 * 일반 AI는 채팅 일일이 하나씩 지시
 * 일일 복붙해야 된다. 그래서 불편하다
 * 
 */




