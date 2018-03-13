package Rollercoaster;

public abstract class Rides {
    private String name;
    private double price;
    private int minAge;
    private double minHeight;

    Rides(String name, double price, int minAge, Double minHeight) {
        this.name = name;
        this.price = price;
        this.minAge = minAge;
        this.minHeight = minHeight;
    }

    public String getName()  {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public int getMinAge(){
        return minAge;
    }

    public double getMinHeight() {
        return minHeight;
    }




}
