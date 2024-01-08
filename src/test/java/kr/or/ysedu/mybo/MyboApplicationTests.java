package kr.or.ysedu.mybo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.or.ysedu.mybo.answer.Answer;
import kr.or.ysedu.mybo.answer.AnswerRepository;
import kr.or.ysedu.mybo.question.Question;
import kr.or.ysedu.mybo.question.QuestionRepository;
import kr.or.ysedu.mybo.question.QuestionService;

@SpringBootTest
class MyboApplicationTests {
	
//	@Autowired
//	private QuestionRepository questionRepository;
//
//  @Autowired
//  private AnswerRepository answerRepository;
    
    @Autowired
    private QuestionService questionService;
	
    @Test
	void testJpa() {
	}
    
//	# Service를 이용한 더미데이터(300개) 만들기     
//	@Test
//	void testJpa() {
//       for (int i=0; i<=300;i++) {
//    	   String subject = String.format("테스트데이터 입니다 [%03d]", i);
//    	   String content = "내용 없음";
//    	   this.questionService.create(subject, content);
//       }
//	}
}
