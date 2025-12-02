package BehavioralPatterns.StrategyPattern.PaymentGatway.Strategy;

public class UPIPayment implements PaymentStrategy {

    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("---- UPI Payment ----");

        if (!upiId.contains("@")) {
            System.out.println("Payment Failed: Invalid UPI ID.");
            return;
        }

        System.out.println("Sending collect request to " + upiId);
        System.out.println("Waiting for user to approve payment...");
        System.out.println("UPI payment of ₹" + amount + " successful.");
    }
}
