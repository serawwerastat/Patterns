
import convertor.MilliampsPerHourToWorkingTimeConvertorAdapter;
import itarator.Iterator;
import modelsOfPhone.IPhone;
import modelsOfPhone.Samsung;
import modelsOfPhone.Xiaomi;
import modelsOfPhone.Nokia;
import remoteControl.CellPhoneControl;
import remoteControl.InstallAppOnPhone;
import repository.CellPhoneRepository;
import repository.Store;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {


        Main main = new Main();

         main.testCommand();
           main.testAdapter();
           main.testIntarator();
           main.testComposite();
           main.testPrototype();

    }

    void testCommand() {

        Samsung samsung = new Samsung();
        InstallAppOnPhone installAppOnPhone = new InstallAppOnPhone(samsung);
        CellPhoneControl cellPhoneControl = new CellPhoneControl(installAppOnPhone);
        cellPhoneControl.pressButton();


    }

    void testPrototype() throws CloneNotSupportedException {
        Samsung samsung1 = new Samsung();
        Samsung samsung2 = (Samsung) samsung1.clone();
        Samsung samsung3 = (Samsung) samsung1.clone();
    }

    void testAdapter(){
        Samsung samsung = new Samsung();
        MilliampsPerHourToWorkingTimeConvertorAdapter horsePowerConvertorAdapter = new MilliampsPerHourToWorkingTimeConvertorAdapter(samsung);
        System.out.println(horsePowerConvertorAdapter.getWorkingTime() + " hours");
    }

    void testIntarator(){

        CellPhoneRepository cellPhoneRepository = new CellPhoneRepository();

        Iterator iterator = cellPhoneRepository.getIterator();

        // itarator.Iterator output.
        while (iterator.hasNext()) {
            System.out.println("CellPhoneInterface.CellPhone make = " + iterator.next());
        }
    }

    void testComposite(){
        // Initialize different Samsung objects
        Samsung samsung1 = new Samsung();
        Samsung samsung2 = new Samsung();
        Samsung samsung3 = new Samsung();

        // Initialize different Nokia objects
        Nokia nokia1 = new Nokia();
        Nokia nokia2 = new Nokia();

        // Initialize different IPhone objects
        IPhone IPhone1 = new IPhone();

        // Initialize different Xiaomi objects
        Xiaomi xiaomi1 = new Xiaomi();
        Xiaomi xiaomi2 = new Xiaomi();

        // Initializes Store objects
        Store store1 = new Store();
        Store store2 = new Store();

        // Add different objects to store1
        store1.addPhone(samsung1);
        store1.addPhone(samsung2);
        store1.addPhone(nokia1);
        store1.addPhone(xiaomi1);

        // Add different objects to store2
        store2.addPhone(samsung3);
        store2.addPhone(nokia2);
        store2.addPhone(IPhone1);
        store2.addPhone(xiaomi2);

        //Output result
        System.out.println("All Cell Phones");
        System.out.println(store1.getName());
        System.out.println();

        //Removing one record from composite
        store1.removeFile(samsung2);

        //Output result
        System.out.println("All Cell Phones after removing samsung2 from store1");
        System.out.println(store1.getName());
    }
}
