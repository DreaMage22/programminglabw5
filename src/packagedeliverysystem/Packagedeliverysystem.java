
package packagedeliverysystem;


public class Packagedeliverysystem {

    
    public static void main(String[] args) {
        
    
     
        Package standardPackage = new Package(
                "Enes Eren", "10 Main St", "Kayseri", "TR", "38280",
                "Yusuf Yilmaz", "5 Center Ave", "Ankara", "TR", "06420",
                10.0, 2.50
        );

        TwoDayPackage twoDayPackage = new TwoDayPackage(
                "Enes Eren", "10 Main St", "Kayseri", "TR", "38280",
                "Semih Kaya", "24 Istiklal St", "Istanbul", "TR", "34430",
                10.0, 2.50, 15.00
        );

        OvernightPackage overnightPackage = new OvernightPackage(
                "Yusuf Yilmaz", "5 Center Ave", "Ankara", "TR", "06420",
                "Enes Eren", "10 Main St", "Kayseri", "TR", "38280",
                10.0, 2.50, 1.25
        );

        System.out.println("=== 1. STANDARD PACKAGE ===");
        standardPackage.printPackageInfo();
        System.out.printf("Total Shipping Cost: $%.2f\n\n", standardPackage.calculateCost());

        System.out.println("=== 2. TWO-DAY PACKAGE ===");
        twoDayPackage.printPackageInfo();
        System.out.printf("Flat Fee           : $%.2f\n", twoDayPackage.getFlatFee());
        System.out.printf("Total Shipping Cost: $%.2f\n\n", twoDayPackage.calculateCost());

        System.out.println("=== 3. OVERNIGHT PACKAGE ===");
        overnightPackage.printPackageInfo();
        System.out.printf("Additional Fee/oz  : $%.2f/oz\n", overnightPackage.getAdditionalFeePerOunce());
        System.out.printf("Total Shipping Cost: $%.2f\n", overnightPackage.calculateCost());
    }
}

