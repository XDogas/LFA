package javaTypes;

public class QuizType extends Type{
	private String instanceOfQuiz;
    
	public QuizType(){
		super("Quiz");
        	instanceOfQuiz = null;
	}
	
	public boolean isNumeric() {
      return false;
    }
    
    public void setInstanceOfQuiz(String quiz) {
        instanceOfQuiz = quiz;
    }
    
    public String getInstanceOfQuiz(){
        return instanceOfQuiz;
    }
}


