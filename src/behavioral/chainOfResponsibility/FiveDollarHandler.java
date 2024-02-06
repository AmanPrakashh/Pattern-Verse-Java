package behavioral.chainOfResponsibility;

public class FiveDollarHandler implements WithdrawalHandler {

    private WithdrawalHandler nextHandler;


    public void handleRequest(Withdraw request)
    {
        int amount = request.getAmount();
        int numberOfBills= amount/5;
        int remainder= amount%5;

        System.out.println("$5 bills dispensed: "+ numberOfBills);

        if(remainder!=0)
        {
            System.out.println("cannot dispense rest: $"+remainder + " amount");
        }
    }
}


