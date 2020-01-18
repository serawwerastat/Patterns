package modelsOfPhone;

public class Nokia extends CellPhoneModel implements Cloneable {

    private String batteryCapacity = "999999mAh";
    private String name = "Nokia 3310";
    private double price = 50;

    public Nokia() {
    }

    public Nokia(String batteryCapacity, String name, double price) {
        this.batteryCapacity = batteryCapacity;
        this.name = name;
        this.price = price;
    }

    @Override public String getBatteryCapacity() {
        return this.batteryCapacity;
    }

    @Override public String getName() {
        return this.name;
    }

    @Override public double getPrice() {
        return this.price;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Nokia(batteryCapacity, name, price);
    }

    @Override
    public String toString() {
        return String.format("%s{batteryCapacity='%s', name='%s'}", this.getClass().getName(), batteryCapacity, name);
    }
}
