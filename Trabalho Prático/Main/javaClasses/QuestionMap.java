package javaClasses;
import java.util.*;

public class QuestionMap {

    private Map<String,AnswersMap> questions;
    int difficulty;

    public QuestionMap() {
        questions = new HashMap<>();
    }

    public void setPercentage(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getPercentage() {
        return difficulty;
    }

    public Map<String,AnswersMap> getQuestions() {
        return questions;
    }

    public void addQuestion(String question) {
        questions.put(question,new AnswersMap());
    }

    public boolean containsQuestion(String question) {
        return questions.containsKey(question);
    }

    public AnswersMap getAnswersMap(String id) {
        return questions.get(id);
    }
}
