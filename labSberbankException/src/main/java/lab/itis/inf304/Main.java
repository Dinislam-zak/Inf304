package lab.itis.inf304;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println(new TradeRequest(20, new BigDecimal(100)));

        } catch (InvalidAmountException e){
            System.out.println("Amount should be greater than 0");
        }
    }
}
