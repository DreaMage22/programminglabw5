/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packagedeliverysystem;

public class Package {
    private String senderName;
    private String senderAddress;
    private String senderCity;
    private String senderState;
    private String senderZip;

    private String recipientName;
    private String recipientAddress;
    private String recipientCity;
    private String recipientState;
    private String recipientZip;

    private double weight;
    private double costPerOunce;

    public Package(String senderName, String senderAddress, String senderCity, String senderState, String senderZip,
                   String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZip,
                   double weight, double costPerOunce) {
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZip = senderZip;

        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.recipientCity = recipientCity;
        this.recipientState = recipientState;
        this.recipientZip = recipientZip;

        setWeight(weight);
        setCostPerOunce(costPerOunce);
    }

    public void setWeight(double weight) {
        if (weight <= 0.0) {
            throw new IllegalArgumentException("Weight must be positive.");
        }
        this.weight = weight;
    }

    public void setCostPerOunce(double costPerOunce) {
        if (costPerOunce <= 0.0) {
            throw new IllegalArgumentException("Cost per ounce must be positive.");
        }
        this.costPerOunce = costPerOunce;
    }

    public double getWeight() {
        return weight;
    }

    public double getCostPerOunce() {
        return costPerOunce;
    }

    public double calculateCost() {
        return weight * costPerOunce;
    }

    public void printPackageInfo() {
        System.out.println("Sender    : " + senderName + " - " + senderAddress + ", " + senderCity + ", " + senderState + " " + senderZip);
        System.out.println("Recipient : " + recipientName + " - " + recipientAddress + ", " + recipientCity + ", " + recipientState + " " + recipientZip);
        System.out.printf("Weight    : %.2f oz | Cost per Ounce: $%.2f/oz\n", weight, costPerOunce);
    }
}