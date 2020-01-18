package modelsOfPhone;

public class Xiaomi extends CellPhoneModel implements Cloneable {

    private String batteryCapacity = "3500mAh";
    private String name = "MI9";
    private double price = 400;

    public Xiaomi() {
    }

    public Xiaomi(String batteryCapacity, String name, double price) {
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
        return new Xiaomi(batteryCapacity, name,price);
    }

    @Override
    public String toString() {
        return String.format("%s{batteryCapacity='%s', name='%s'}", this.getClass().getName(), batteryCapacity, name);
    }

}
