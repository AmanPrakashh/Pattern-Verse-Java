package behavioral.chainOfResponsibility;

// Request class to represent withdrawal requests
public class Withdraw {
    private int amount;

    public Withdraw(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
