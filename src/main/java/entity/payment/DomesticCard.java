package entity.payment;

public class DomesticCard extends Card{
    private String issueBank;
    public DomesticCard(String cardCode, String cardHolderName, String dateExpired, String issueBank) {
        super(cardCode, cardHolderName, dateExpired);
        Type = "DomesticCard";
        this.issueBank = issueBank;
    }
}
