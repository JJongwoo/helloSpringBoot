package kr.ac.hansung.cse.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	static Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/")
	public String home(Model model) {
		
		
		//property에 설정해놓은 단계 이상만 본다 -> info로 설정돼있을시 찍히지 않음
		logger.debug("Calling home()");
		
		model.addAttribute("message", "hello world");
		return "index";
	}
	
}
