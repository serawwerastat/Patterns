package modelsOfPhone;

public class IPhone extends CellPhoneModel implements Cloneable {

    private String batteryCapacity = "3000mAh";
    private String name = "IPhone11";
    private double price = 1000;

    public IPhone() {
    }

    public IPhone(String batteryCapacity, String name, double price) {
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
        return new IPhone(batteryCapacity, name, price);
    }

    @Override
    public String toString() {
        return String.format("%s{batteryCapacity='%s', name='%s'}", this.getClass().getName(), batteryCapacity, name);
    }

}
