import database.DataBase;
import enums.Gender;
import models.Group;
import models.Lesson;
import models.Student;
import service.impl.GroupServiceImpl;
import service.impl.LessonServiceImpl;
import service.impl.StudentServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerForNum = new Scanner(System.in);
        DataBase dataBase = new DataBase();
        GroupServiceImpl groupService = new GroupServiceImpl();
        LessonServiceImpl lessonService = new LessonServiceImpl();
        StudentServiceImpl studentService = new StudentServiceImpl();
        MainLoop:
        while (true){
            System.out.println("""
                    1 - Кируу
                    0 - Чыгуу
                    """);
            String consol1 = scanner.nextLine();
            switch (consol1){
                case "1" ->{

                    Loop:
                    while (true){
                        System.out.println("Пароль жазыныз : ");
                        String consol2 = scanner.nextLine();
                        if (consol2.equals("password2005")){
                            InnerLoop:
                            while (true){
                                System.out.println("""
                                        1 - Группа тузуу
                                        2 - Бардык группаларды корсотуу
                                        3 - Группаны издоо
                                        4 - Группаны очуруу
                                        5 - Группанын атын озгортуу
                                        6 - Сабак кошуу
                                        7 - Сабактардын баарын коруу
                                        8 - Группанын сабактарын чыгаруу
                                        9 - Сабакты очуруу
                                        10 - Жаны студент кошуу
                                        11 - Группадагы студенттерди алуу
                                        0 - Чыгуу
                                        """);
                                String consol3 = scanner.nextLine();
                                switch (consol3){
                                    case "1" ->{
                                        Group group = new Group();
                                        System.out.println("Группанын атын жазыныз : ");
                                        String consol4 = scanner.nextLine();
                                        group.setName(consol4);
                                        groupService.addGroup(group, dataBase.getGroups());
                                    }
                                    case "2" ->{
                                        System.out.println(groupService.getAllGroups(dataBase.getGroups()));
                                    }
                                    case "3" ->{
                                        System.out.println("Группанын атын жазыныз : ");
                                        String consol5 = scanner.nextLine();
                                        System.out.println(groupService.getGroupByName(consol5, dataBase.getGroups()));
                                    }
                                    case "4" ->{
                                        System.out.println("Группанын атын жазыныз : ");
                                        String consol6 = scanner.nextLine();
                                        ArrayList<Group> groups = new ArrayList<>(groupService.deleteGroup(consol6, dataBase.getGroups()));
                                        dataBase.getGroups().clear();
                                        dataBase.getGroups().addAll(groups);
                                    }
                                    case "5" ->{
                                        System.out.println("Озгортуу кылуучу групанын атын жазыныз : ");
                                        String consol = scanner.nextLine();
                                        System.out.println("Группага жаны ат жазыныз :");
                                        String newName = scanner.nextLine();
                                        groupService.updateGroup(consol, newName, dataBase.getGroups());
                                    }
                                    case "6" ->{
                                        Lesson newLesson = new Lesson();
                                        System.out.println("Кайсы группага кошосуз? Ошол группанын атын жазыныз:");
                                        String consol = scanner.nextLine();
                                        System.out.println("Сабактын атын жазыныз :");
                                        newLesson.setName(scanner.nextLine());
                                        lessonService.addLesson(newLesson, consol, dataBase.getGroups());
                                    }
                                    case "7" ->{
                                        lessonService.getAllLessons(dataBase.getGroups());
                                    }
                                    case "8" ->{
                                        System.out.println("Группанын атын жазыныз:");
                                        System.out.println(lessonService.getLessonsByGroup(scanner.nextLine(), dataBase.getGroups()));
                                    }
                                    case "9" ->{
                                        System.out.println("Кайсы группанын сабагын очуросуз? Ошол группанын атын жазыныз:");
                                        String groupName = scanner.nextLine();
                                        System.out.println("Сабактын атын жазыныз:");
                                        String lessonName = scanner.nextLine();
                                        lessonService.deleteLesson(groupName, lessonName, dataBase.getGroups());
                                    }
                                    case "10" ->{
                                        Student student = new Student();
                                        System.out.println("Атын жазыныз:");
                                        student.setName(scanner.nextLine());
                                        System.out.println("Фамилиясын жазыныз:");
                                        student.setSurname(scanner.nextLine());
                                        System.out.println("Жашын жазыныз:");
                                        student.setAge(scannerForNum.nextInt());
                                        System.out.println("Жынысын жазыныз:");
                                        String gender = scanner.nextLine();
                                        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("m")) {
                                            student.setGender(Gender.MALE);
                                        }else if (gender.equalsIgnoreCase("famale") || gender.equalsIgnoreCase("f")) {
                                                student.setGender(Gender.MALE);
                                        } else System.err.println("Туура эмес жыныс берип жатасыз!");
                                        System.out.println("Эл.адресин жазыныз:");
                                        student.setGmail(scanner.nextLine());
                                        System.out.println("Паролюн жазыныз:");
                                        student.setPassword(scanner.nextLine());
                                        System.out.println("Кайсы группага кошосуз , группанын атын жазыныз:");
                                        String console = scanner.nextLine();
                                        studentService.addStudent(student,console,dataBase.getGroups());

                                    }
                                    case "11" ->{
                                        System.out.println("Группанын атын жазыныз:");
                                        String console = scanner.nextLine();
                                        System.out.println(studentService.getStudentsByGroup(console, dataBase.getGroups()));
                                    }
                                    case "0" ->{
                                        break MainLoop;
                                    }
                                }
                            }
                        }
                        else if (consol2.equals("0")) {
                            break Loop;
                        }
                        else {
                            System.err.println("Пароль туура эмес ! Кайра аракет кылып корунуз . Же болбосо токтотууну кааласаныз 0 ду басыныз !");
                        }
                    }
                }
                case "0" ->{
                    break MainLoop;
                }
            }
        }


    }
}