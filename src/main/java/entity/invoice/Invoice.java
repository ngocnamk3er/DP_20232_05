package entity.invoice;

import entity.order.Order;

public class Invoice {

    private Order order;
    // Có dấu hiệu vi phạm DIP tại đây. Do Invoice sử dụng trực tiếp Order
    private int amount;
    
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
}
