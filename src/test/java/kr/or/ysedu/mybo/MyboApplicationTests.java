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

@SpringBootTest
class MyboApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;

    @Autowired
    private AnswerRepository answerRepository;
	
	@Test
	void testJpa() {
        Optional<Question> oq = this.questionRepository.findById(2);
		assertTrue(oq.isPresent());
		Question q = oq.get();
		
		Answer a = new Answer();
		a.setContent("네 자동으로 생성됩니다.");
		a.setCreateDate(LocalDateTime.now());
		a.setQuestion(q);
		this.answerRepository.save(a);
	}
	

}
