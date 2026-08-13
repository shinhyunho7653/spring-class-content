package com.yonsai.Day57_20260812_2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EdiyaController {

	// 메인페이지
	@GetMapping("/ediya")
	public String main() {
		return "이디야 메인페이지입니다";
	}
	
	// 메뉴페이지
	@GetMapping("/menu")
	public String menu() {
		return "메뉴페이지입니다";
	}
	
	// 메뉴 - 음료페이지
	@GetMapping("/drink")
	public String drink() {
		return "음료페이지입니다";
	}
	
}
