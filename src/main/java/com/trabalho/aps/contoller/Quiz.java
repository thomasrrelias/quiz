package com.trabalho.aps.contoller;

import com.trabalho.aps.domain.dto.QuestionDto;
import com.trabalho.aps.domain.entity.Question;
import com.trabalho.aps.service.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/aps")
public class Quiz {
    private final QuestionService perguntaService;

    public Quiz(QuestionService perguntaService) {
        this.perguntaService = perguntaService;
    }

    @GetMapping("/questions/{id}")
    public ResponseEntity<Question> fetchQuestionById(@PathVariable("id") final Long id) {
        return ResponseEntity.ok(perguntaService.fetchQuestionById(id));
    }

    @GetMapping("/questions")
    public ResponseEntity<List<Question>> searchAllQuestions() {
        return ResponseEntity.ok(perguntaService.searchAllQuestions());
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<QuestionDto> cadastrar(@RequestBody QuestionDto questionDto) {
        return ResponseEntity.ok(perguntaService.cadastrarPergunta(questionDto));
    }
}
