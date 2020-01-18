package remoteControl;

import cellPhoneInterface.CellPhone;

/**
 *  TurnCellPhoneOn class implements remoteControl.Command interface.
 */
public class TurnCellPhoneOn implements Command {

    private CellPhone cellPhone;

    /**
     * Constructor for easier initialization.
     * @param cellPhone Device object.
     */
    public TurnCellPhoneOn(CellPhone cellPhone){
        this.cellPhone = cellPhone;
    }

    /**
     * Execute device's turn on command.
     */
    @Override
    public void execute() {
        cellPhone.turnOn();
    }
}
