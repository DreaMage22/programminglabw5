
package packagedeliverysystem;

public class OvernightPackage extends Package {
    private double additionalFeePerOunce;

    public OvernightPackage(String senderName, String senderAddress, String senderCity, String senderState, String senderZip,
                            String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZip,
                            double weight, double costPerOunce, double additionalFeePerOunce) {
        super(senderName, senderAddress, senderCity, senderState, senderZip,
              recipientName, recipientAddress, recipientCity, recipientState, recipientZip,
              weight, costPerOunce);
        setAdditionalFeePerOunce(additionalFeePerOunce);
    }

    public void setAdditionalFeePerOunce(double additionalFeePerOunce) {
        if (additionalFeePerOunce < 0.0) {
            throw new IllegalArgumentException("Additional fee per ounce cannot be negative.");
        }
        this.additionalFeePerOunce = additionalFeePerOunce;
    }

    public double getAdditionalFeePerOunce() {
        return additionalFeePerOunce;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + (getWeight() * additionalFeePerOunce);
    }
}