public class Answer {
    
    private String text;
    private double value;
    private boolean enabled;

    public Answer(String text, double value) {
        this.text = text;
        this.value = value;
        enabled = false;
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
    public String getText() {
        return text;
    }

    public double value() {
        return value;
    }

    @Override
    public String toString() {
        return "Text: " + text + "; Value: " + value;
    }
}
