package BehavioralPatterns.StrategyPattern.Navigation;

public class ShortestRoute implements RouteStrategy{

    @Override
    public void buildRoute(String source, String destination) {
        System.out.println("Calculating shortest route" + source + " to " + destination);

    }
}
