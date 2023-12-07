import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contact contact1 = new Contact("Nurgazy", "0111111111");
        Contact contact2 = new Contact("Nurmukhammed", "0111111111");
        Contact contact3 = new Contact("Nur", "0111111111");
        Contact contact4 = new Contact("Nurai", "0111111111");
        Contact contact5 = new Contact("Mirlan", "0111111111");
        Contact contact6 = new Contact("Nurtilek", "0111347689");
        Contact contact7 = new Contact("Aliaskar", "0456456789");
        Contact contact8 = new Contact("Jigit", "0999999999");
        Contact contact9 = new Contact("Aiturgan", "0777777777");
        Contact contact10 = new Contact("Gulumkan", "0666666666");
        Contact contact11 = new Contact("Zaripbek", "0555555555");
        Contact contact12 = new Contact("Nurlan", "0444444444");
        Contact contact13 = new Contact("Agai", "0333333333");
        Contact contact14 = new Contact("Ejeke", "0222222222");
        ArrayList<Contact> contacts = new ArrayList<>(Arrays.asList(contact1, contact2, contact3, contact4, contact5, contact6,contact7,contact8, contact9,
                contact10, contact11,contact12,contact13,contact14));
        Phone phone = new Phone("samsung", "nurtash", contacts);
        MainLoop:
        while (true) {
            System.out.print("Ввыведите пароль: ");
            String consolPassword = scanner.nextLine();
            boolean chek = phone.turnOn(consolPassword);
            if (chek){
                while (true){
                    System.out.println("""
                            Выберите функцию
                            1. Звонить
                            2. Контакты
                            0. Отключить 
                        """);
                    switch (scanner.nextLine()){
                        case "1" ->{
                            System.out.println("""
                                    1.Звонить по номеру телефона
                                    2.Звонить по имя контакта
                                    """);
                            switch (scanner.nextLine()){
                                case "1" ->{
                                    System.out.println("Ввыведите номер телефона : ");
                                    String consol = scanner.nextLine();
                                    System.out.println(phone.callWithPhoneNumber(consol));
                                }
                                case "2" ->{
                                    System.out.println("Ввыведите имя контакта : ");
                                    String consol = scanner.nextLine();
                                    System.out.println(phone.callWithName(consol));
                                }
                            }
                        }
                        case "2" ->{
                            System.out.println("1.Показать все контакты \n2.Найти контак по имени \n3.Найти контакт по номеру телефона \n4.Изменить контакт");
                            switch (scanner.nextLine()){
                                case "1" ->{
                                    System.out.println(phone.getAllContact());
                                }
                                case "2" ->{
                                    System.out.println("Ввыведите имя контакта : ");
                                    System.out.println(phone.getContactByName(scanner.nextLine()));
                                }
                                case "3" ->{
                                    System.out.println("Ввыведите номер телефона : ");
                                    System.out.println(phone.getContactByPhoneNumber(scanner.nextLine()));
                                }
                                case "4" ->{
                                    phone.updateContact();
                                }
                            }
                        }
                        case "0" ->{
                            break MainLoop;
                        }
                        default -> System.err.println("Error");
                    }
                }
            }
            else System.err.println("Не правильный пароль ! ");
        }

    }
}