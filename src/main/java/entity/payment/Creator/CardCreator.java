package entity.payment.Creator;

import entity.payment.Card;

public interface CardCreator {
    Card createCard(String cardCode, String cardHolderName, String dateExpired, int cvvCode);
}
