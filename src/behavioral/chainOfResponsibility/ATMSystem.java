package behavioral.chainOfResponsibility;

import java.util.Spliterator;

public class ATMSystem {

    public static void main(String[] args) {
        TwentyDollarHandler twentyHandler = new TwentyDollarHandler();
        TenDollarHandler tenHandler = new TenDollarHandler();
        FiveDollarHandler fiveHandler = new FiveDollarHandler();

        twentyHandler.setNextHandler(tenHandler);
        tenHandler.setNextHandler(fiveHandler);

        Withdraw withdraw = new Withdraw(75);
        twentyHandler.handleRequest(withdraw);
    }


}
