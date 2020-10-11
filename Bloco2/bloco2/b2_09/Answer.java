import java.util.*;

public class Answer {

    private String answerText;
    private int answerScore;

    public Answer(String text, int score) {
        answerText = text;
        answerScore = score;
    }

    public String getAnswerText() {
        return this.answerText;
    }

    public int getAnswerScore() {
        return this.answerScore;
    }

    @Override
    public String toString() {
        return this.answerText + ";"; // se for a ultima resposta é '.' em vez de ';'
    }
}
