package javaClasses;
import java.util.*;

public class Section {

    private String id;
    private List<Question> questions;
    private int current;
    private double percentage;

    public Section(String id) {
        questions = new ArrayList<Question>();
        this.id = id;
        percentage = 100;
        //start outside
        current = -1;
    }

    public String getID() {
        return id;
    }

    public int size() {
        return questions.size();
    }
    
    public Question getCurrent() {
        Question q = null;

        if(current > -1) {
            q = questions.get(current);
        }

        return q;
    }

    public Question getPrevious() {
        Question q = null;

        if(hasPrev()) {
            q = questions.get(current-1);
        }

        return q;
    }

    public Question getNext() {
        Question q = null;

        if(hasNext()) {
            q = questions.get(current+1);
        }

        return q;
    }

    public Question getLast() {
        Question q = null;

        if(questions.size() > 0) {

            q = questions.get(questions.size() - 1);
        }

        return q;
    }

    public Question getFirst() {
        Question q = null;

        if(questions.size() > 0) {
            q = questions.get(0);
        }

        return q;
    }
    
    public Question getByID(String id) {
        return questions.get(getIndexOfQuestion(id));
    }
    
    //assert(no duplicates) 
    //to implement on visitors
    public boolean addQuestion(Question q) {
        //default start on first question
        if(current == -1) {
            current = 0;
        }
        return questions.add(q);
    }

    public boolean addQuestionList(List<Question> list) {
        return questions.addAll(list);
    }

    public boolean isEmpty() {
        return questions.size() == 0;
    }  

    public boolean hasNext() {
        return (current > -1 && (current + 1) < questions.size());
    }

    public boolean hasPrev() {
        return (current - 1) > -1;
    }
    
    //goes to next question (circular)
    public void goToNext() {
        if(hasNext()) {
            current++;
        } 
        else {
            goToStart();
        }
    }
    
    //goes to next unanswered question, if there is none nothing happens (circular)
    public void goToNextUnanswered() {
        goToNextUnanswered(0);    
    }
    
    private void goToNextUnanswered(int count) {
        goToNext();
        count++;
        if(questions.get(current).isAnswered() && count < questions.size()) {
            goToNextUnanswered(count);
        }
    }
    
    //goest to previous question (circular)
    public void goToPrev() {
        if(hasPrev()) {
            current--;
        }
        else {
            goToEnd();
        }
    }

    //goes to prev unanswered question, if there is none nothing happens (circular)
    public void goToPrevUnanswered() {
        goToPrevUnanswered(0); 
    }
    
    private void goToPrevUnanswered(int count) {
        goToPrev();
        count++;
        if(questions.get(current).isAnswered() && count < questions.size()) {
            goToPrevUnanswered(count);
        }
    }

    public void goToEnd() {
        current = questions.size() - 1;
    }

    public void goToStart() {
        if(questions.size() == 0) {
            current = -1;
        }
        else {
            current = 0;
        }
    }

    //Throws NoSuchElementException in case QuestionId doesnt exist
    public void goTo(String id) {
        int index = getIndexOfQuestion(id);
        
        current = index;
    }
    
    public Iterator<Question> iteratorQuestions() {
        return questions.iterator();
    }

    public Iterator<Question> iteratorAnsweredQuestions() {
        List<Question> answered = new LinkedList<>();

        for(Question q : questions) {
            if(q.isAnswered()) {
                answered.add(q);
            }
        }

        return answered.iterator();
    }

    public Iterator<Question> iteratorUnansweredQuestions() {
        List<Question> unanswered = new LinkedList<>();

        for(Question q : questions) {
            if(!q.isAnswered()) {
                unanswered.add(q);
            }
        }

        return unanswered.iterator();

    }
    
    public void setPercentagem(int percentage) {
        assert(percentage >= 0  && percentage <= 100);
        this.percentage = percentage;
    }
    
    public double result() {
               
        double result = 0;
        //value isnt implement for questions
        double i = 0;
        for(Question q : questions) {
            result = result + q.value();
            i++;
        }
        
        result = result / i;
        return result;
    }
    
    public double value() {
        return result() * (percentage / 100);
    }

    //Throws NoSuchElementException in case QuestionId doesnt exist
    public int getIndexOfQuestion(String id) {
        Iterator<Question> itr = questions.iterator();
        boolean found = false;
        Question tmp = null;
        
        int index = 0;
        int i = 0;
        while(itr.hasNext() && !found) {
            tmp = itr.next();

            if(tmp.getID().equals(id)) {
                index = i;
                found = true;
            }
            i++;
        }
        
        
        if(!found) throw new NoSuchElementException();

        return index;
    }
} 
