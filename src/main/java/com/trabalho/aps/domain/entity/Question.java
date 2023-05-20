package com.trabalho.aps.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Entity
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Question {

//    public Question() {
//    }

    public Question(String pergunta, List<String> alternativa, int pontuacao, int respostaCorreta) {
        setPergunta(pergunta);
        setAlternativa(alternativa);
        setPontuacao(pontuacao);
        setRespostaCorreta(respostaCorreta);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String pergunta;

    @ElementCollection
    @CollectionTable(name = "pergunta_alternative", joinColumns = @JoinColumn(name = "pergunta_id"))
    private List<String> alternativa;

    @Column
    private Integer respostaCorreta;

    @Column
    private Integer pontuacao;


    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public List<String> getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(List<String> alternativa) {
        this.alternativa = alternativa;
    }

    public Integer getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(Integer respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }
}
