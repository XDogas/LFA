package javaClasses;
import java.util.*;

public class Quiz {
    
    private List<Section> sections;
    private int current;
    private String participant;
    private String id;
    private int maxScore;
   
    private Map<String, Options> optionsMap;

    public Quiz(String participant, int maxScore) {
        this.participant = participant;
        this.maxScore = maxScore;
        this.current = -1;

        sections = new ArrayList<>();
        optionsMap = new HashMap<>();
    }

    public String getID() {
        return id;
    } 

    public String getParticipant() {
        return participant;
    }

    public double getMaxScore() {
        return maxScore;
    }

    public void setListSections(List<Section> sections) {
        //default start on first section
        if(current == -1) {
            current = 0;
        }
        this.sections = sections;
    }

    public Section getCurrent() {
        Section current = null;

        if(this.current > -1) {
            current = sections.get(this.current);
        }

        return current;
    }

    public Section getByID(String id) {
        return sections.get(getIndexOfSection(id));
    }
    
    public int size() {
        int size = 0;

        for(Section s : sections) {
            size += s.size();
        }

        return size;
    } 
    
    public double result() {
    
        double score = 0;
        
        for(Section s : sections) {
            score += s.value();
        }
        score = score * maxScore / 100;
        return score;
    }
   
    public void setParticipant(String name) {
        participant = name;
    } 

    public void setMaxScore(int score) {
        assert(score >= 0);
        maxScore = score; 
    }
    
    public void enableOptionsByID(String id) {
        assert(optionsMap.containsKey(id));

        Options options = optionsMap.get(id);
        options.enableAll();
    }
    
    public void disableOptionsByID(String id) {
        assert(optionsMap.containsKey(id));

        Options options = optionsMap.get(id);
        options.disableAll();
    }

    public boolean hasNext() {
        return (current > -1 && (current + 1) < sections.size());
    }

    public boolean hasPrev() {
        return current - 1 > -1;
    }
    
    //goes to next Section (circular)
    public void goToNext() {
        if(hasNext()) {
            current += 1;
        } 
        else {
            goToStart();
        }
    }
    
    public void goToPrev() {
        if(hasPrev()) {
            current--;
        }   
        else {
            goToEnd();
        }
    }

    public void goToEnd() {
        current = sections.size() - 1;
    }

    public void goToStart() {
        if(sections.size() == 0) { 
            current = -1;
        }
        else {
            current = 0;
        }
    }    
    
    //Throws NoSuchElementException in case SectionId doesnt exist
    public void goTo(String id) {
        int index = getIndexOfSection(id);
        
        current = index;
    }

    public Iterator<Section> iteratorSections() {
        return sections.iterator();
    }
    

    //assert(no duplicates) 
    //to implement on visitors
    public boolean addSection(Section s) {
        //default start on first Section
        if(current == -1) {
            current = 0;
        }
        return sections.add(s);
    }
    
    public void addOptions(Options options) {
        assert(!optionsMap.containsKey(options.getID()));
        optionsMap.put(options.getID(), options);
    }
    
    //Throws NoSuchElementException in case SectionId doesnt exist
    public int getIndexOfSection(String id) {
        Iterator<Section> itr = sections.iterator();
        boolean found = false;
        Section tmp = null;
        
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

    @Override

    public String toString() {
        String res = "\n";
        
         
        for(int i = 0; i < sections.size(); i++) {
            Section s = sections.get(i);
            res = res.concat("------------" + s.getID() + "------------\n");
            res = res.concat("Perguntas por responder: ");
            
            Iterator<Question> itr = s.iteratorUnansweredQuestions();
            
            while(itr.hasNext()) {
                Question q = itr.next();
                res = res + (s.getIndexOfQuestion(q.getID()) + 1);

                if(itr.hasNext()) {
                    res = res + ", ";
                }
            }

            res = res.concat("\nPerguntas respondidas: ");
            
            itr = s.iteratorAnsweredQuestions();
            
            while(itr.hasNext()) {
                Question q = itr.next();
                res = res + (s.getIndexOfQuestion(q.getID()) + 1);
                res = res.concat(':' + q.getSelectedAnswer());
                

                if(itr.hasNext()) {
                    res = res + ", ";
                }
            }
            
            res = res.concat("\n");
        }

        return res;
    }
}
