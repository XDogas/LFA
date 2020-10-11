import java.util.*;

public class Quiz {
    
    private List<Section> sections;
    private int current;
    private String participant;
    private int maxScore;

    public Quiz(String participant, int maxScore) {
        this.participant = participant;
        this.maxScore = maxScore;
        this.current = -1;

        sections = new ArrayList<>();
    }
    
    public String getParticipant() {
        return participant;
    }

    public double getMaxScore() {
        return maxScore;
    }

    public Section getCurrent() {
        Section current = null;

        if(this.current > -1) {
            current = sections.get(this.current);
        }

        return current;
    }
    
    public double result() {
    
        double score = 0;
        
        for(Section s : sections) {
            score += s.value();
        }
        
        return score;
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
    public void goToSection(String id) {
        int index = getIndexOfSection(id);
        
        current = index;
    }

    public Iterator<Section> iteratorSections() {
        return sections.iterator();
    }
    

    //assert(no duplicates) 
    //to implement on visitors
    public boolean addSection(Section s) {
        return sections.add(s);
    }
    
    //Throws NoSuchElementException in case SectionId doesnt exist
    private int getIndexOfSection(String id) {
        Iterator<Section> itr = sections.iterator();
        boolean found = false;
        Section tmp = null;
        
        int index = 0;
        int i = 0;
        while(itr.hasNext() && !found) {
            tmp = itr.next();

            if(tmp.getId().equals(id)) {
                index = i;
                found = true;
            }
            i++;
        }
        
        if(!found) throw new NoSuchElementException();

        return index;
    }
}
