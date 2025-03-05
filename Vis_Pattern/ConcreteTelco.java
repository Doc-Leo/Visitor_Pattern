

public class ConcreteTelco implements TelcoSubscription {

    public ConcreteTelco(String globe, int i, int i0, boolean b) {
    }

    @Override
    public boolean hasUnliCallText() {
        return false; // Implement your logic here
    }

    @Override
    public String accept(UsagePromo promo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String accept(UnliCallsTextOffer unliPackage) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getTelcoName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double getPromoPrice() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
