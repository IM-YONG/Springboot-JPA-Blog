package com.jjang.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 스프링이 com.jjang.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new하는 것은 아니구요.
// 특정 어노테이션이 붙어있는 클래스 파일들을 new해서(IoC) 스프링 컨테이너에 관리해 줍니다.
@RestController 
public class BlogControllerTest {

	// Run As > Spring Boot App한 후 브라우져에 아래 주소를 입력하면 Hello Spring Boot가 표시
	// http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>Hello Spring Boot</h1>";
	}
}
