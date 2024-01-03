package kr.or.ysedu.mybo.answer;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import kr.or.ysedu.mybo.question.Question;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AnswerService {
	private final AnswerRepository answerRepository;
	
	public void create(Question question, String Content) {
		Answer answer = new Answer();
		answer.setContent(Content);
		answer.setCreateDate(LocalDateTime.now());
		answer.setQuestion(question);
		this.answerRepository.save(answer);
	}
	
}
