package BehavioralPatterns.StrategyPattern.PaymentGatway.Strategy;

public class CreditCardPayment implements PaymentStrategy {

    private String cardNumber;
    private String cardHolderName;
    private String cvv;

    public CreditCardPayment(String cardNumber, String cardHolderName, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cvv = cvv;

    }

    @Override
    public void pay(int amount) {
        System.out.println("---- Credit Card Payment ----");

        if (!isValidCard()) {
            System.out.println("Payment Failed: Invalid card details.");
            return;
        }

        System.out.println("Verifying cardholder: " + cardHolderName);
        System.out.println("Checking card limit...");
        System.out.println("Processing transaction of ₹" + amount);
        System.out.println("Payment Successful using Credit Card.");
    }

    private boolean isValidCard() {
        return cardNumber.length() == 16 && cvv.length() == 3;
    }
}
