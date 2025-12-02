package BehavioralPatterns.StrategyPattern.Navigation;

public class MainDemo {
    public static void main(String[] args) {
        Navigation engine = new Navigation();

        engine.setStrategy(new FastestRoute());
        engine.navigate("Delhi", "Mumbai");

        engine.setStrategy(new ShortestRoute());
        engine.navigate("Goa" , "Ahmedabad");

        engine.setStrategy(new ScenicRoute());
        engine.navigate("Shimla", "Goa");



    }
}
