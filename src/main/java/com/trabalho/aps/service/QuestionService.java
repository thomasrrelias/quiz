package com.trabalho.aps.service;

import com.trabalho.aps.domain.dto.QuestionDto;
import com.trabalho.aps.domain.entity.Question;
import com.trabalho.aps.repository.QuestionRepository;
import com.trabalho.aps.service.builder.QuestionBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    private final QuestionRepository questionRepository ;
    private final QuestionBuilder questionBuilder;

    public QuestionService(QuestionRepository questionRepository, QuestionBuilder questionBuilder) {
        this.questionRepository = questionRepository;
        this.questionBuilder = questionBuilder;
    }

    public Question fetchQuestionById(final Long id) {
        return questionRepository.getById(id);
    }

    public List<Question> searchAllQuestions() {
        return questionRepository.findAll();
    }

    public QuestionDto cadastrarPergunta(QuestionDto questionDto){
        final Question question = questionBuilder.toQuestion(questionDto);
        return questionBuilder.toQuestionDto(questionRepository.save(question));
    }
}
