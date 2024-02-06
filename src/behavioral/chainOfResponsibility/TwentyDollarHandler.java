package behavioral.chainOfResponsibility;

public class TwentyDollarHandler implements WithdrawalHandler {
    private WithdrawalHandler nextHandler;

    @Override
    public void handleRequest(Withdraw request) {
        int amount = request.getAmount();
        int numberOfBills = amount / 20;
        int remainder = amount % 20;
        System.out.println("$20 bills dispensed: " + numberOfBills);
        if (remainder != 0 && nextHandler != null) {
            nextHandler.handleRequest(new Withdraw(remainder));
        }
    }

    public void setNextHandler(WithdrawalHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}