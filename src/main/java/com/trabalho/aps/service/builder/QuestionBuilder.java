package com.trabalho.aps.service.builder;

import com.trabalho.aps.domain.dto.QuestionDto;
import com.trabalho.aps.domain.entity.Question;
import org.springframework.stereotype.Component;

@Component
public class QuestionBuilder {

    public Question toQuestion(final QuestionDto questionDto){
        return Question.builder()
                .pergunta(questionDto.getPergunta())
                .alternativa(questionDto.getAlternativa())
                .respostaCorreta(questionDto.getRespostaCorreta())
                .pontuacao(questionDto.getPontuacao())
                .build();
    }

    public QuestionDto toQuestionDto(final Question question){
        return QuestionDto.builder()
                .pergunta(question.getPergunta())
                .alternativa(question.getAlternativa())
                .respostaCorreta(question.getRespostaCorreta())
                .pontuacao(question.getPontuacao())
                .build();
    }
}
