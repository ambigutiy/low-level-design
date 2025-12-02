package BehavioralPatterns.StrategyPattern.PaymentGatway.context;

import BehavioralPatterns.StrategyPattern.PaymentGatway.Strategy.PaymentStrategy;

public class PaymentProcessor {

    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(int amount) {
        strategy.pay(amount);
    }

}
