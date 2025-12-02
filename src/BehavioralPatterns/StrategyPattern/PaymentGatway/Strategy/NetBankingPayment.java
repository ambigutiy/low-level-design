package BehavioralPatterns.StrategyPattern.PaymentGatway.Strategy;

public class NetBankingPayment implements PaymentStrategy {

    private String bankName;
    private String userId;
    private String password;

    public NetBankingPayment(String bankName, String userId, String password) {
        this.bankName = bankName;
        this.userId = userId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println("---- NetBanking Payment ----");

        if (!isAuthorized()) {
            System.out.println("Payment Failed: Invalid login credentials.");
            return;
        }

        System.out.println("Logging into " + bankName + " NetBanking portal...");
        System.out.println("Processing fund transfer of ₹" + amount);
        System.out.println("Payment Successful using NetBanking.");
    }

    private boolean isAuthorized() {
        return !userId.isEmpty() && !password.isEmpty();
    }
}
