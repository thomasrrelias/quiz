package com.trabalho.aps.repository;

import com.trabalho.aps.domain.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
