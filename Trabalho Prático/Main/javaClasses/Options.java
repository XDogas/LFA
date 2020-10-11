package javaClasses;

import java.util.*;

public class Options {
    private Map<String,Option> options;
    String id;
    
    public Options(String id) {
        options = new HashMap<>();
        this.id = id;
    }
    
    public String getID() {
        return id;
    }

    public Map<String,Option> getOptions() {
        return options;
    }
    
    public Option getByOptionID(String id) {
        assert(options.containsKey(id));
        
        return options.get(id);
    }
    
    public String getOptionText(String id) {
        assert(options.containsKey(id));
        
        return options.get(id).getText();
    }

    public boolean containsOption(String id) {
        return options.containsKey(id);
    }
    public void addOption(Option op) {
        assert(!options.containsKey(op.getID()));
        String id = op.getID();

        options.put(id, op);
    }
    
    public void enableAll() {
        for(String id : options.keySet()) {
            Option op = options.get(id);
            op.enable();
        }
    }

    public void disableAll() {
        for(String id : options.keySet()) {
            Option op = options.get(id);
            op.disable();
        }

    }

    public void enableOption(String id) {
        Option op = options.get(id);
        op.enable();
    }

    public void disableOption(String id) {
        Option op = options.get(id);
        op.disable();
    }

    public boolean isEnabled(String opID) {
        assert(options.containsKey(opID));
        
        return options.get(opID).isEnabled(); 
    }

}
