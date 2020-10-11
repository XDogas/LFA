import java.util.*;

public class Question {

    private String questionID;
    private String questionText;
    private List<Answer> answersList;

    public Question(String ID, String text) {
        questionID = ID;
        questionText = text;
        answersList = new ArrayList<>();
    }

    public String getQuestionID() {
        return this.questionID;
    }

    public String getQuestionText() {
        return this.questionText;
    }

    public List<Answer> getAnswers() {
        return this.answersList;
    }

    public int getNumAnswers() {
        return answersList.size();
    }

    @Override
    public String toString() {
        return this.questionText;
    }
}
