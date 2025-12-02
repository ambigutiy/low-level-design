package BehavioralPatterns.StrategyPattern.PaymentGatway.Strategy;

public class WalletPayment implements PaymentStrategy {

    private String walletId;
    private String mobileNumber;

    public WalletPayment(String walletId, String mobileNumber) {
        this.walletId = walletId;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("---- Wallet Payment ----");

        if (!isWalletValid()) {
            System.out.println("Payment Failed: Wallet authentication failed.");
            return;
        }

        System.out.println("Checking wallet balance...");
        System.out.println("Applying cashback rewards...");
        System.out.println("Wallet payment of ₹" + amount + " successful.");
    }

    private boolean isWalletValid() {
        return mobileNumber.matches("\\d{10}") && walletId.startsWith("WALLET");
    }
}
