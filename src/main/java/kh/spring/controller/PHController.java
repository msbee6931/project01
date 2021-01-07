package kh.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PHController {

	@RequestMapping("request.ph")
	public String request() {
		System.out.println("병합 확인 부탁 드려요!!");
		return "ph";
	}
}
