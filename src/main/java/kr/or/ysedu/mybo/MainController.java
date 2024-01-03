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
		return "indexg11g121g";
	}
	
	
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
	
	
}
