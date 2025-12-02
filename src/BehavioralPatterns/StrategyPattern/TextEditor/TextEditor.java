package BehavioralPatterns.StrategyPattern.TextEditor;


// Context Class — TextEditor
public class TextEditor {
    private TextFormatStrategy strategy;

    public void setStrategy(TextFormatStrategy strategy) {
        this.strategy = strategy;
    }

    public String applyFormat(String text){
        return strategy.format(text);
    }
}
