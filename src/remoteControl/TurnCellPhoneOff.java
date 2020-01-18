package remoteControl;

import cellPhoneInterface.CellPhone;

/**
 *  TurnCellPhoneOff class implements remoteControl.Command interface.
 */
public class TurnCellPhoneOff implements Command {

    private CellPhone cellPhone;

    /**
     * Constructor for easier initialization.
     * @param cellPhone Device object.
     */
    public TurnCellPhoneOff(CellPhone cellPhone){
        this.cellPhone = cellPhone;
    }

    /**
     * Execute device's turn off command.
     */
    @Override
    public void execute() {
        cellPhone.turnOff();
    }
}
