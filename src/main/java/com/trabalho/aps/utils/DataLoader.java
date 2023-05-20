package com.trabalho.aps.utils;

import com.trabalho.aps.domain.entity.Question;
import com.trabalho.aps.repository.QuestionRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader {
    private final QuestionRepository questionRepository;

    public DataLoader(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    @Bean
    public void loadData() {
        List<Question> perguntas = new ArrayList<>();

        perguntas.add(new Question("O que é logística reversa?",
                Arrays.asList(
                        "a) O processo de entrega de produtos para o consumidor final.",
                        "b) O processo de retorno de produtos para a empresa.",
                        "c) O processo de transporte de mercadorias de um ponto a outro."),
                1, 1));
        perguntas.add(new Question("Quais são os objetivos da logística reversa?",
                Arrays.asList(
                        "a) Reduzir os custos de produção.",
                        "b) Promover a reutilização e a reciclagem de materiais.",
                        "c) Aumentar o lucro da empresa."), 1, 1));
        perguntas.add(new Question("Quais são os tipos de logística reversa?",
                Arrays.asList(
                        "a) Devolução de produtos pelo consumidor.",
                        "b) Recuperação de produtos para reutilização ou reciclagem.",
                        "c) Gerenciamento de produtos com prazo de validade expirado.",
                        "d) Todas as alternativas anteriores."), 1, 3));
        perguntas.add(new Question("Qual é o papel do consumidor na logística reversa?",
                Arrays.asList(
                        "a) Devolver os produtos para a empresa.",
                        "b) Descartar os produtos de forma adequada.",
                        "c) Promover a reciclagem de materiais."), 1, 0));
        perguntas.add(new Question("Como a tecnologia pode ajudar na logística reversa?",
                Arrays.asList(
                        "a) Automatizando processos de coleta e triagem de materiais.",
                        "b) Reduzindo os custos de produção.",
                        "c) Aumentando a produção de resíduos."), 1, 0));
        perguntas.add(new Question("Quais são os principais desafios da logística reversa?",
                Arrays.asList(
                        "a) Baixa adesão dos consumidores.",
                        "b) Falta de incentivos financeiros para as empresas.",
                        "c) Dificuldades na coleta e triagem de materiais."), 1, 2));
        perguntas.add(new Question("Como a logística reversa pode ser uma ferramenta para a sustentabilidade ambiental?",
                Arrays.asList(
                        "a) Promovendo a reciclagem e a reutilização de materiais.",
                        "b) Reduzindo os custos de produção.",
                        "c) Aumentando a produção de resíduos."), 1, 0));
        perguntas.add(new Question("Quais são as tendências atuais em logística reversa?",
                Arrays.asList(
                        "a) Maior investimento em tecnologia e automação.",
                        "b) Maior colaboração entre empresas e governos.",
                        "c) Todas as alternativas anteriores."), 1, 2));
        perguntas.add(new Question("Qual é o impacto da logística reversa na imagem da empresa?",
                Arrays.asList(
                        "a) Nenhum impacto.",
                        "b) Melhoria da imagem junto aos consumidores e à sociedade em geral.",
                        "c) Piora da imagem junto aos consumidores."), 1, 1));
        perguntas.add(new Question("Qual é a importância da logística reversa para a economia circular?",
                Arrays.asList(
                        "a) Não tem importância.",
                        "b) É um dos pilares da economia circular.",
                        "c) É um conceito oposto à economia circular."), 1, 1));

        questionRepository.saveAll(perguntas);
    }
}
