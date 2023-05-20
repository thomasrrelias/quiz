package com.trabalho.aps.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QuestionDto {

    private String pergunta;
    private List<String> alternativa;
    private Integer respostaCorreta;
    private Integer pontuacao;

}
