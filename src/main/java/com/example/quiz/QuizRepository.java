package com.example.quiz;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.quiz.Question;
public interface QuizRepository extends JpaRepository<Question, Serializable> {

	



}