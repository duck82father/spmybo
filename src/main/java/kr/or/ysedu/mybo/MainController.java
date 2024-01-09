package kr.or.ysedu.mybo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
	
	@GetMapping("/mybo")
	@ResponseBody
	public String index() {
		return "비밀을 발견하셨군요! 축하합니다. 선물은 없어요~!";
	}
	
	
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
	
	
}
