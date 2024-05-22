package entity.payment;

public class DomesticCard extends Card{
    public DomesticCard(String cardCode, String owner, String dateExpired, int cvvCode) {
        super(cardCode, owner, dateExpired, cvvCode);
    }
}
