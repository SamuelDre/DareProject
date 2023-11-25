package Chapter3Exercise;

public class Car {
    private String model;
    private String year;
    private double price;
    private double discount;
    public Car(String model, String year, double price){
        this.model = model;
        this.year = year;
        if ( price > 0){
            this.price = price;
        } else if (price < 0) {
            System.out.println("price is not positive");
        }
    }
    public void setDiscount( double discountAmount){
        if (discountAmount >0){
            price = price - (price * discountAmount);
        }

    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getYear() {
        return year;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
