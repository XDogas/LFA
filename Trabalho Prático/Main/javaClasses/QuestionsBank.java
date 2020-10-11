package javaClasses;
import java.util.*;

public class QuestionsBank {
    
    private Map<String,List<String>> themeAlias;
    private Map<String,Question> questionMap;
    private int maxDifficulty;
    private int minDifficulty;

    public QuestionsBank() {
        themeAlias = new HashMap<>();
        questionMap = new HashMap<>();

        maxDifficulty = 10;
        minDifficulty = 0;
    }

    public void setMinDifficulty(int difficulty) {
        minDifficulty = difficulty;
    }

    public void setMaxDifficulty(int difficulty) {
        maxDifficulty = difficulty;
    }
    
    public int getMaxDifficulty() {
        return maxDifficulty;
    }

    public int getMinDifficulty() {
        return minDifficulty;
    }
    
    public boolean validDifficulty(Question q) {
        return ( minDifficulty <= q.getDifficulty() ) && ( q.getDifficulty() <= maxDifficulty );
    }
    public boolean containsQuestion(String id) {
        return questionMap.containsKey(id);
    }
    
    public boolean containsTheme(String theme) {
        return themeAlias.containsKey(theme);
    }
    
    //The id of each question must be unique and must be in range of defined difficulty interval
    public void addQuestion(Question q) {     
        assert(!containsQuestion(q.getID()) && validDifficulty(q));

        String theme = q.getTheme();
        String id = q.getID();

        questionMap.put(id, q);  
        List<String> questionsId = themeAlias.get(theme);

        //Add new alias
        if(questionsId == null) {
            questionsId = new LinkedList<>();
            themeAlias.put(theme, questionsId);
        }
        
        //Add new question to alias list
        questionsId.add(id);
    }
    
    public Question getById(String id) {
        return questionMap.get(id);
    }

    public List<Question> getByTheme(String theme) {
        List<Question> questions = new LinkedList<>();
        
        List<String> questionsId = themeAlias.get(theme);
        
        for(String id : questionsId) {
            questions.add(getById(id));
        }
        
        return questions;
    }

    //toString for debugging purpose
    @Override
    public String toString() {
        
        String str = "List of Question:\n";
       
        Set<String> keySet = questionMap.keySet();
        for(String key : keySet) {
            str = str.concat("id: " + key + "\n");
            str = str.concat(questionMap.get(key) + "\n\n");
        }

        
        str = str.concat("List of questions for each theme: \n");

        keySet = themeAlias.keySet();
        
        for(String key : keySet) {
            //concat theme
            str = str.concat("------" + key + "------\n");

            //concat QuestionId for each theme
            List<String> ids = themeAlias.get(key); 
            
            for(String questionId : ids) {
                str = str.concat(questionId + "\n");
            }

            str = str.concat("\n");

        }

        return str;
    }
}
