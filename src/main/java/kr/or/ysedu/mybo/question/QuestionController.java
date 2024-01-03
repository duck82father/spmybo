package kr.or.ysedu.mybo.question;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Controller
public class QuestionController {
	
	private final QuestionService questionService;

//  '@RequiredArgsConstructor'가 담당하는 역할 
//	public QuestionController (QuestionRepository questionRepository) {
//		this.questionRepository = questionRepository;
//	}
	
	@GetMapping("/question/list")
	public String list(Model model) {
		List<Question> questionList = this.questionService.getList();
		model.addAttribute("questionList", questionList);
		return "question_list";
	}

}
