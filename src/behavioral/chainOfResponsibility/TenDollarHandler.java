package behavioral.chainOfResponsibility;



public class TenDollarHandler implements WithdrawalHandler
{
    private WithdrawalHandler nextHandler;
   public void handleRequest(Withdraw request)
   {
       int amount = request.getAmount();
       int numberOfBills = amount/10;
       int remainder = amount%10;
       System.out.println("$10 bills dispensed: " + numberOfBills);
       if(remainder!=0 && nextHandler!=null)
       {
           nextHandler.handleRequest(new Withdraw(remainder));
       }
   }
   public void setNextHandler(WithdrawalHandler nextHandler)
   {
       this.nextHandler = nextHandler;
   }
}
