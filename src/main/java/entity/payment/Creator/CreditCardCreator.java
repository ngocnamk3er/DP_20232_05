package entity.payment.Creator;

import entity.payment.Card;
import entity.payment.CreditCard;

public class CreditCardCreator implements CardCreator {

    @Override
    public Card createCard(String cardCode, String cardHolderName, String dateExpired, int cvvCode) {
        return new CreditCard(cardCode, cardHolderName, dateExpired, cvvCode);
    }
}