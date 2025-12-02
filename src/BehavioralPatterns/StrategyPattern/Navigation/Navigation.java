package BehavioralPatterns.StrategyPattern.Navigation;

public class Navigation {
    private RouteStrategy strategy;

    public void setStrategy(RouteStrategy strategy){
        this.strategy = strategy;
    }

    public void navigate(String source, String destination){
        strategy.buildRoute(source, destination);
    }
}
