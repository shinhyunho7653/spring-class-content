package com.yonsai.first.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

}

// 자바랑 브라우저랑 데이터를 주고 받고 할 수 있도록
// 도와주는 역할이 서버(톰캣)다
// 서버의 세팅을 자동으로 해주는 역할이 springboot 

// spring
//	- 톰캣이 받은 요청을 어떤 코드로 처리할 지 정리하는 코드
//	- 서버가 요청을 받으면 어떤 Java 코드가 처리할지 연결하고
//	  전체적인 웹 개발을 도와주는 프레임워크

// 프레임워크 
//	- 프로그램을 만들 때 사용할 큰 틀과 규칙을 미리 만들어 놓은것

// 스프링 프로젝트 구조
// src/main/java 
//	- Java 코드만 작성하는 곳

// MainApplication.java
//	- 프로그램의 시작점 
//	- 서버 실행

// src/main/resources
//	- 설정파일 등을 놓는곳(이미지,웹 설정,앱 설정,mysql)
//	static - css, javascript, 이미지 브라우저에서 사용하는 프론트앤드
//			 코드들이 들어간다

// pom.xml
//	- 필요한 라이브러리 다운로드받는곳

// Maven Dependncies 
//	- 다운 받아온 라이브러리들이 모여있는 폴더






