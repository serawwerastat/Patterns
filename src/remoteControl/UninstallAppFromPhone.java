package remoteControl;

import cellPhoneInterface.CellPhone;

/**
 *  UninstallAppFromPhone class implements remoteControl.Command interface.
 */
public class UninstallAppFromPhone implements Command {

    private CellPhone cellPhone;

    /**
     * Constructor for easier initialization.
     * @param cellPhone Device object.
     */
    public UninstallAppFromPhone(CellPhone cellPhone){
        this.cellPhone = cellPhone;
    }

    /**
     * Execute device's uninstall app command.
     */
    @Override
    public void execute() {
        cellPhone.uninstallApp();
    }
}
