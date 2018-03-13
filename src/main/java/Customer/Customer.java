package Customer;

public abstract class Customer {

    private String name;
    private int age;
    private int height;
    private double wallet;

    Customer(String name, int age, int height, double wallet) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }


}



