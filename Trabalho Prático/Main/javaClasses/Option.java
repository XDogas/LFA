package javaClasses;

public class Option {
    
    private String id;
    private String text;    
    private boolean enabled;

    public Option(String id, String text) {
        this.id = id;
        this.text = text;
        this.enabled = false;
    }
    
    public String getID() {
        return id;
    }

    public String getText() {
        return text;
    }
    
    public void enable() {
        enabled = true;
    }

    public void disable() {
        enabled = false;
    }
    
    public boolean isEnabled() {
        return enabled;
    }
}
