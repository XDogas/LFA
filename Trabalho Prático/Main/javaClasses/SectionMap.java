package javaClasses;
import java.util.*;

public class SectionMap {

    private Map<String,QuestionMap> sections;

    public SectionMap(){
        sections = new HashMap<>();
    }

    public Map<String,QuestionMap> getSections(){
        return sections;
    }

    public void addSection(String section) {
        sections.put(section, new QuestionMap());
    }

    public boolean containsSection(String nameSection) {
        return sections.containsKey(nameSection);
    }

    public QuestionMap getQuestionMap(String id) {
        return sections.get(id);
    }
}
