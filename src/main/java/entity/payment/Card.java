package entity.payment;

import java.time.LocalDate;

public abstract class Card {
    private String Type;
    private String cardCode;
    private String cardHolderName;
    private String dateExpired;
    private String issueBank;
    private String validFrom;
    protected int cvvCode;

    public Card(String cardCode, String cardHolderName, String dateExpired, int cvvCode) {
        this.cardCode = cardCode;
        this.cardHolderName = cardHolderName;
        this.dateExpired = dateExpired;
        this.cvvCode = cvvCode;
        this.issueBank = issueBank;
    }

    public Card(String cardCode, String cardHolderName, String issueBank, String validFrom) {
        this.cardCode = cardCode;
        this.cardHolderName = cardHolderName;
        this.issueBank = issueBank;
        this.validFrom = validFrom;
    }

    public Card(String cardCode, String cardHolderName, String dateExpired, int cvvCode, String issueBank, String validFrom, String Type) {
        this.cardCode = cardCode;
        this.cardHolderName = cardHolderName;
        this.dateExpired = dateExpired;
        this.cvvCode = cvvCode;
        this.issueBank = issueBank;
        this.validFrom = validFrom;
        this.Type = Type;
    }

    public Card() {

    }
}