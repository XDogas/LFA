package javaClasses;
import java.util.*;

public class AnswersMap {

    private HashSet<String> answers;
    
    public AnswersMap() {
        answers = new HashSet<>();
    }

    public HashSet<String> getAnswers() {
        return answers;
    }

    public boolean addAns(String ans) {
        return answers.add(ans);
    }

    public boolean containsAns(String nameAns) {
        return answers.contains(nameAns);
    }
}
