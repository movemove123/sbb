package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@GetMapping("/sbb")
	@ResponseBody
    public String index() {
        return "안녕하세요 sbb에 오신것을 환영합니다.";
    }
	
	@GetMapping("/")
    public String root() {
        return "redirect:/main";
    }
	
	@GetMapping("/main")
	public String simpleShopPage() {
		return "simpleShop";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@GetMapping("/join")
    public String joinPage() {
        return "join"; // 회원가입 페이지의 Thymeleaf 템플릿 이름
    }
	
	@GetMapping("/cart")
	public String cartPage() {
		return "cart";
	}
}
