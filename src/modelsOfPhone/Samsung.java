package modelsOfPhone;

public class Samsung extends CellPhoneModel implements Cloneable {

    private String batteryCapacity = "2500mAh";
    private String name = "Samsung5s";
    private double price = 300;

    public Samsung() {
    }

    public Samsung(String batteryCapacity, String name, double price) {
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
        return new Samsung(batteryCapacity, name, price);
    }

    @Override
    public String toString() {
        return String.format("%s{batteryCapacity='%s', name='%s'}", this.getClass().getName(), batteryCapacity, name);
    }
}
