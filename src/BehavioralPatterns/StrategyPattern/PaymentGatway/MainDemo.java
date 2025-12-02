package BehavioralPatterns.StrategyPattern.PaymentGatway;

import BehavioralPatterns.StrategyPattern.PaymentGatway.Strategy.CreditCardPayment;
import BehavioralPatterns.StrategyPattern.PaymentGatway.Strategy.NetBankingPayment;
import BehavioralPatterns.StrategyPattern.PaymentGatway.Strategy.UPIPayment;
import BehavioralPatterns.StrategyPattern.PaymentGatway.Strategy.WalletPayment;
import BehavioralPatterns.StrategyPattern.PaymentGatway.context.PaymentProcessor;

public class MainDemo {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.setStrategy(new CreditCardPayment("1234567890123456", "John Doe", "123", "12/25"));
        processor.executePayment(500);

        processor.setStrategy(new NetBankingPayment("john.doe", "password123", "Bank of Examples"));
        processor.executePayment(1000);

        processor.setStrategy(new UPIPayment("xyz@ibl.com"));
        processor.executePayment(750);

        processor.setStrategy(new WalletPayment("wallet123", "9876543210"));
        processor.executePayment(300);
    }

}
