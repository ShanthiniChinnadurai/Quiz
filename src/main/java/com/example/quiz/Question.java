package com.example.quiz;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
class Question
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     @Column
    private String language;
     @Column
    private String question;
    
    @Column
   private String[] code;

    @Column
    private String options;

    public Integer getId() {
		return id;
	}

    public void setId(Integer id) {
		this.id = id;
	}

    public String getlanguage() {
		return language;
	}

	public void setlanguage(String language) {
		this.language = language;
	}

    public String getquestion() {
		return question;
	}

	public void setquestion(String question) {
		this.question = question;
	}

  /**
   * @return the code
   */
  public String[] getCode() {
      return code;
  }
  /**
   * @param code the code to set
   */
  public void setCode(String[] code) {
      this.code = code;
  }
  
    
    public String getoptions(){
        return options;
    }

    public void setoptions(String options) {
    this.options = options;
}
//  @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "book_detail_id")

}