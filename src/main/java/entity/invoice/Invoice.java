package entity.invoice;

import entity.order.Order;

public class Invoice {

    private Order order;
    private int amount;

    private String cardType;
    
    public Invoice(){

    }

    public Invoice(Order order){
        this.order = order;
        this.amount = order.getTotal();
    }

    public Order getOrder() {
        return order;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void saveInvoice(){
        
    }

    public String getCardType() {
        return cardType;
    }
}
