public class Telco implements TelcoSubscription {
    private final String telcoName;
    private final double promoPrice;
    private final int dataAllowance;
    private final boolean unliCallText;

    public Telco(String telcoName, int dataAllowance, double promoPrice, boolean unliCallText) {
        this.telcoName = telcoName;
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.unliCallText = unliCallText;
    }

    @Override
    public String getTelcoName() {
        return telcoName;
    }

    @Override
    public double getPromoPrice() {
        return promoPrice;
    }

    @Override
    public boolean hasUnliCallText() {
        return unliCallText;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }

    @Override
    public String accept(UsagePromo promo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String accept(UnliCallsTextOffer unliPackage) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
