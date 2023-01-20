import com.tmdrn.DeskPhone;
import com.tmdrn.ITelephone;
import com.tmdrn.MobilePhone;

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ITelephone tmdrnPhone;
        tmdrnPhone = new DeskPhone(123456);
        tmdrnPhone.powerOn();
        tmdrnPhone.callPhone(123456);

        tmdrnPhone = new MobilePhone(54321);
        tmdrnPhone.powerOn();

        // List is interface class and ArrayList, LinkedList, Vector are implementation class of List
        List<MobilePhone> myList = new Vector<>();
        myList.add(new MobilePhone(3333));
        myList.add(new MobilePhone(4444));
        myList.get(0).powerOn();
        myList.get(1).powerOn();
    }
}