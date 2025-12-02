package BehavioralPatterns.StrategyPattern.TextEditor;


// Concrete Strategy class
public class UppercaseFormat implements TextFormatStrategy{
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
