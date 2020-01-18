package convertor;

import cellPhoneInterface.CellPhone;

public class MilliampsPerHourToWorkingTimeConvertorAdapter implements MilliampsPerHourToWorkingTimeConvertor {

    /**
     * Horse Power convertor, which is wrapped and being adapted.
     */
    CellPhone cellPhone;

    /**
     * Constructor with parameter of CellPhone object
     * @param cellPhone Horse Power convertor.
     */
    public MilliampsPerHourToWorkingTimeConvertorAdapter(CellPhone cellPhone) {
        this.cellPhone = cellPhone;
    }


    @Override
    public String getWorkingTime() {
        double hp = Double.parseDouble(cellPhone.getBatteryCapacity().replaceAll("mAh",""));
        return String.valueOf(hp*72/360);
    }
}
