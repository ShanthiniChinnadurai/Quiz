package com.example.quiz;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

class AnswerKey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String answer;
    public String getanswer() {
        return answer;
    }

    public void setanswer(String answer) {
        this.answer = answer;
    }

    @OneToOne
    @JoinColumn(name = "id")
    private Question que;

    public Integer getId() {
        return que.getId();
    }

}
// public Integer getId() {
    // 	return id;
    // }

    // public void setId(Integer id) {
    // 	this.id = id;
    // }