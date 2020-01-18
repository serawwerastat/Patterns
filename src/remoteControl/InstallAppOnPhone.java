package remoteControl;

import cellPhoneInterface.CellPhone;

/**
 *  InstallAppOnPhone class implements remoteControl.Command interface.
 */
public class InstallAppOnPhone implements Command {

    private CellPhone cellPhone;

    /**
     * Constructor for easier initialization.
     * @param cellPhone Device object.
     */
    public InstallAppOnPhone(CellPhone cellPhone){
        this.cellPhone = cellPhone;
    }

    /**
     * Execute device's install app command.
     */
    @Override
    public void execute() {
        cellPhone.installApp();
    }
}
