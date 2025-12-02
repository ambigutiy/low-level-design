package BehavioralPatterns.StrategyPattern.Navigation;

public class ScenicRoute implements RouteStrategy{

    @Override
    public void buildRoute(String source, String destination) {
        System.out.println("Calculating scenic route " + source + " to " + destination);

    }
}
