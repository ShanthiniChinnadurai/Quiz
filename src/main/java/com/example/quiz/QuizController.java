package com.example.quiz;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/question")
public class QuizController{

 @Autowired
  private QuizRepository qp;

  @RequestMapping(method = RequestMethod.POST)
  public Question addQuestion(@RequestBody Question question )
  {
    question.setId(null);
    return qp.saveAndFlush(question);
  }

   @RequestMapping(method = RequestMethod.GET)
  public List<Question> viewQuestions()
  {
     return qp.findAll();
  }

  

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public Question updateQuestion(@RequestBody Question updatequestion, @PathVariable Integer id) {
    updatequestion.setId(id);
    return qp.saveAndFlush(updatequestion);
  }
  
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deletequestion(@PathVariable Integer id) {
    qp.deleteById(id);
  }
}