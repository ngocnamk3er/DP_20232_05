package entity.payment.Creator;

import entity.payment.Card;
import entity.payment.CreditCard;
import entity.payment.DomesticCard;

public class DomesticCardCreator implements CardCreator {

    private String cardCode;
    private String cardHolderName;
    private String dateExpired;
    private String issueBank;

    public DomesticCardCreator(String cardCode, String cardHolderName, String dateExpired, String issueBank) {
        this.cardCode = cardCode;
        this.cardHolderName = cardHolderName;
        this.dateExpired = dateExpired;
        this.issueBank = issueBank;
    }


    @Override
    public Card createCard() {
        return new DomesticCard(cardCode, cardHolderName, dateExpired, issueBank);
    }
}