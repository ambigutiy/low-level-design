package BehavioralPatterns.StrategyPattern.Navigation;

public class FastestRoute implements RouteStrategy{

    @Override
    public void buildRoute(String source, String destination) {
        System.out.println("Calculating fastest route" + source + " to " + destination);
    }
}
