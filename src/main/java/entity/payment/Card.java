package entity.payment;

import java.time.LocalDate;

public abstract class Card {
    protected String Type;
    private String cardCode;
    private String cardHolderName;
    private String dateExpired;


    public Card(String cardCode, String cardHolderName, String dateExpired) {
        this.cardCode = cardCode;
        this.cardHolderName = cardHolderName;
        this.dateExpired = dateExpired;
    }

    public String getType(){
        return Type;
    }

    public Card() {

    }
}