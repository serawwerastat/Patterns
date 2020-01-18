package remoteControl;

/**
 * Remote control of cell phone as invoker.
 */
public class CellPhoneControl {

    private Command command;

    /**
     * Constructor for easier initialization.
     * @param command remoteControl.Command object.
     */
    public CellPhoneControl(Command command){
        this.command = command;
    }

    /**
     * Calls remoteControl.Command object method execute.
     */
    public void pressButton(){
        command.execute();
    }

}
