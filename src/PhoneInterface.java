import java.util.ArrayList;

public interface PhoneInterface {
    boolean turnOn(String password);
    String callWithName(String name);
    String callWithPhoneNumber(String phoneNumber);
    ArrayList<Contact> getAllContact();
    Contact getContactByName(String name);
    Contact getContactByPhoneNumber(String phoneNumber);
    void updateContact();



}
