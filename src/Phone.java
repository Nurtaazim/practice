import java.util.ArrayList;
import java.util.Scanner;

public class Phone implements PhoneInterface{
    private String brand;
    private String password;
    private ArrayList<Contact> contacts;

    public Phone(String brand, String password, ArrayList<Contact> contacts) {
        this.brand = brand;
        this.password = password;
        this.contacts = contacts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }


    @Override
    public boolean turnOn(String password) {
        boolean chek = false;
        if (password.equals(getPassword())) chek = true;
        else chek = false;
        return chek;
    }

    @Override
    public String callWithName(String name) {
        for (Contact contact : this.contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return "Colling to " + contact.getName();
            }
        }
        return "Myndai contact jok";
    }

    @Override
    public String callWithPhoneNumber(String phoneNumber) {
        for (Contact contact : this.contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)){
                return "Colling to " + contact.getName();
            }
        }
        return "Myndai contact jok";
    }

    @Override
    public ArrayList<Contact> getAllContact() {
        return this.contacts;
    }

    @Override
    public Contact getContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) return contact;
        }
        return null;
    }

    @Override
    public Contact getContactByPhoneNumber(String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) return contact;
        }
        return null;
    }

    @Override
    public void updateContact() {
        System.out.println("Напишите имя контакта или номер телефона :");
        String consol = new Scanner(System.in).nextLine();
        Contact contact = new Contact();
        for (Contact contact1 : contacts) {
            if (contact1.getName().equalsIgnoreCase(consol) || contact1.getPhoneNumber().equals(consol)){
                System.out.println(contact1);
                System.out.println("Что вы хотите изменить \n1 - Изменить номер телефона \n2 - Изменить имя контакта");
                switch (new Scanner(System.in).nextLine()){
                    case "1" ->{
                        System.out.println("Напишите новый номер телефона :");
                        contact1.setPhoneNumber(new Scanner(System.in).nextLine());
                        System.out.println("Контакт успешно обновлен !");
                    }
                    case "2" ->{
                        System.out.println("Напишите новый имя контакта :");
                        contact1.setName(new Scanner(System.in).nextLine());
                        System.out.println("Контакт успешно обновлен !");
                    }
                }
            }
        }
    }


    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", password='" + password + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
