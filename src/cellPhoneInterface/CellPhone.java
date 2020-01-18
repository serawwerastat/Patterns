package cellPhoneInterface;

public interface CellPhone {

    String getBatteryCapacity();

    String getName();

    double getPrice();

    /**
     * Turn cell phone on.
     */
    void turnOn();

    /**
     * Turn cell phone off.
     */
    void turnOff();

    /**
     * Install application on cell phone.
     */
    void installApp();

    /**
     * Uninstall application on cell phone.
     */
    void uninstallApp();
}
