package entity.payment.Creator;

import entity.payment.Card;
import entity.payment.DomesticCard;

public class DomesticCardCreator implements CardCreator {

    @Override
    public Card createCard(String cardCode, String cardHolderName, String dateExpired, int cvvCode) {
        return new DomesticCard(cardCode, cardHolderName, dateExpired, cvvCode);
    }
}