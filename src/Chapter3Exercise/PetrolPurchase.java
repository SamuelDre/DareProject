package Chapter3Exercise;

public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantity;
    private double pricePerLitre;
    private double percentageDiscount;
    private double purchaseAmount = 99;

    public PetrolPurchase() {

    }

    public PetrolPurchase(String location, int quantity, double pricePerLitre) {
        this.location = location;
        this.quantity = quantity;
        this.pricePerLitre = pricePerLitre;
    }

    public PetrolPurchase(String location, int quantity, double pricePerLitre, String petrolType) {

    }

    public PetrolPurchase(String location, String petrolType, int quantity, double pricePerLitre, double percentageDiscount){
        this.location = location;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
        if (quantity > 0 ){
            this.purchaseAmount = quantity * pricePerLitre - percentageDiscount;
        }
    }
    public void setPurchaseAmount(double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
    public double getPurchaseAmount() {
        return purchaseAmount;
    }
    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }
    public double getPricePerLitre() {
        return pricePerLitre;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }
    public String getPetrolType() {
        return petrolType;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }
    public double getPercentageDiscount() {

        return percentageDiscount;
    }

}


