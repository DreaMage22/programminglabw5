
package packagedeliverysystem;

public class TwoDayPackage extends Package {
    private double flatFee=5;

    public TwoDayPackage(String senderName, String senderAddress, String senderCity, String senderState, String senderZip,
                         String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZip,
                         double weight, double costPerOunce, double flatFee) {
        super(senderName, senderAddress, senderCity, senderState, senderZip,
              recipientName, recipientAddress, recipientCity, recipientState, recipientZip,
              weight, costPerOunce);
        setFlatFee(flatFee);
    }

    public void setFlatFee(double flatFee) {
        if (flatFee < 0.0) {
            throw new IllegalArgumentException("Flat fee cannot be negative.");
        }
        this.flatFee = flatFee;
    }

    public double getFlatFee() {
        return flatFee;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + flatFee;
    }
}