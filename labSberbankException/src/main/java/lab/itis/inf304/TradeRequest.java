package lab.itis.inf304;

import java.math.BigDecimal;

public class TradeRequest {

    private int amount;

    private BigDecimal total;

    public TradeRequest(int amount, BigDecimal total) throws InvalidAmountException{
        setAmount(amount);
        this.total = total;
    }

    public int getAmount() {
        return amount;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void setAmount (int amount) throws InvalidAmountException{
        if (amount <= 0){
            throw new InvalidAmountException();
        }
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TradeRequest{" +
                "amount=" + amount +
                ", total=" + total +
                '}';
    }
}
