package entity.payment.Creator;

import entity.payment.Card;
import entity.payment.CreditCard;

public class CreditCardCreator implements CardCreator {

    private String cardCode;
    private String cardHolderName;
    private String dateExpired;
    private int cvvCode;

    public CreditCardCreator(String cardCode, String cardHolderName, String dateExpired, int cvvCode) {
        this.cardCode = cardCode;
        this.cardHolderName = cardHolderName;
        this.dateExpired = dateExpired;
        this.cvvCode = cvvCode;
    }


    @Override
    public Card createCard() {
        return new CreditCard(cardCode, cardHolderName, dateExpired, cvvCode);
    }
}