package modelsOfPhone;

import cellPhoneInterface.CellPhone;

public abstract class CellPhoneModel implements CellPhone {

    // Variables to count moves
    private boolean isOn;
    private int installedAppCount = 0;

    @Override
    public abstract String getBatteryCapacity();

    @Override
    public abstract String getName();

    public abstract double getPrice();

    /**
     * Turn device on and display result.
     */
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Phone turned on " + isOn);
    }

    /**
     * Turn device off and display result.
     */
    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Phone turned off " + isOn);
    }

    /**
     * Install app and display result.
     */
    @Override
    public void installApp() {
        installedAppCount++;
        System.out.println("App is installed on Phone " + installedAppCount);
    }

    /**
     * Uninstall app and display result.
     */
    @Override
    public void uninstallApp() {
        if(installedAppCount > 0) {
            installedAppCount--;
            System.out.println("App is uninstalled from Phone " + installedAppCount);
        } else {
            System.out.println("Noting to uninstall");
        }
    }
}
