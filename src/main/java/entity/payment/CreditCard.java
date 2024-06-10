package entity.payment;

/**
 * @author
 */
public class CreditCard extends Card{

    private int cvvCode;
    public CreditCard(String cardCode, String cardHolderName, String dateExpired, int cvvCode) {
        super(cardCode, cardHolderName, dateExpired);
        Type = "CreditCard";
        this.cvvCode = cvvCode;
    }
}
