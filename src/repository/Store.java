package repository;

import cellPhoneInterface.CellPhone;

import java.util.ArrayList;
import java.util.List;

public class Store implements CellPhone {

    /**
     * Composite which could contain different phones.
     */
    private List<CellPhone> cellPhoneSystem = new ArrayList<>();

    /**
     * Adding objects to Array list.
     * @param cellPhone New cell phone to add.
     */
    public void addPhone(CellPhone cellPhone){
        cellPhoneSystem.add(cellPhone);
    }

    /**
     * Removing objects from Array list.
     * @param cellPhone File to remove.
     */
    public void removeFile(CellPhone cellPhone){
        cellPhoneSystem.remove(cellPhone);
    }

    @Override
    public String getBatteryCapacity() {
        StringBuilder builder = new StringBuilder();
        builder.append(" - Total Battery Capacity ");
        double batteryCapacity = 0;
        for (CellPhone cellPhone : cellPhoneSystem) {
            batteryCapacity += Double.parseDouble(cellPhone.getBatteryCapacity());
        }
        builder.append(batteryCapacity + " - HP");

        return builder.toString();
    }

    @Override
    public String getName() {
        StringBuilder builder = new StringBuilder();
        builder.append(" - Diving into repository.Store ");
        for (CellPhone cellPhone : cellPhoneSystem) {
            builder.append(cellPhone.getName() + " ");
        }
        builder.append(" - repository.Store processed");

        return builder.toString();
    }

    public double getPrice() {
        return cellPhoneSystem.stream().mapToDouble(CellPhone::getPrice).sum();
    }

    /**
     * Move device left and display result.
     */
    @Override
    public void turnOn() {

    }

    /**
     * Move device right and display result.
     */
    @Override
    public void turnOff() {

    }

    /**
     * Move device forward and display result.
     */
    @Override
    public void installApp() {

    }

    /**
     * Move device backward and display result.
     */
    @Override
    public void uninstallApp() {

    }
}
