package BehavioralPatterns.StrategyPattern.TextEditor;


// Concrete Strategy class
public class TitlecaseFormat implements TextFormatStrategy{

    @Override
    public String format(String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for(String word: words){
            if(!word.isEmpty()){
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
            }
        }
        return result.toString().trim();
    }
}
