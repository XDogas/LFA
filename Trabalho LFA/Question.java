import java.util.*;


public class Question {

    private Map<String, Answer> answers;
    private String theme;
    private String id;
    private String text;
    private int difficulty;
    private double percentage;
   
    private String selectedAnswer;

    public Question(String theme, String id, String text, int difficulty) {
        this.theme = theme;
        this.id = id;
        this.text = text;
        this.difficulty = difficulty;
        this.percentage = -1;
        
        answers = new HashMap<>();
        selectedAnswer = null;
    }
    
    public String getId() {
        return id;
    }
    
    public String getText() {
        return text;
    }
    
    // theme pattern -> Theme/SubTheme/../SubTheme
    public String getTheme() {
        return theme;
    }

    public Map<String, Answer> getAnswers() {
        return answers;
    }

    public int getDifficulty() {
        return difficulty;
    }
    
    public boolean isAnswered() {
        if(selectedAnswer == null) {
            return false;
        }

        return true; 
    }
    
    //no duplicates
    //
    public Answer addAnswer(Answer ans, String answerId) {
        assert(!answers.containsKey(answerId));
        
        return answers.put(answerId, ans);
    }

    public void enableAnswer(String answerId) {
        assert(answers.containsKey(answerId));

        answers.get(id).enable();
    }
    
    public void setPercentagem(int percentage) {
        assert(percentage >= 0  && percentage <= 100);
        this.percentage = percentage;
    }
    
    public void enableAll() {
        Set<String> ids = answers.keySet();

        for(String id : ids) {
            answers.get(id).enable();
        }
    }

    public boolean answer(String answerId) {
        if(answers.get(answerId) != null && answers.get(answerId).isEnabled()) {
            selectedAnswer = answerId;
            return true;
        }

        return false; 
    }

    public double result() {
        if(selectedAnswer == null) {
            return 0;
        }
        
        return answers.get(selectedAnswer).value();
    }
    
    public double value() {
        //error percentagem not defined
        if(percentage < 0) {
            return -1;
        }
        return result() * (percentage / 100);
    }

    //toString for debugging purpose
    @Override
    public String toString() {

        return "-------" + id + "-------\n" +
               "Theme: " + theme + "\n" +
               "Text: " + text + "\n" +
               "Difficulty: " + difficulty + "\n" +
               "Percentage: " + percentage + "\n" +
               "Answers: " + answers + "\n" +
               "SelectedAnswer: " + selectedAnswer + "\n";
    }

}
