package ru.job4j.pojo;

/**
 * В классе находится метод main
 * для демонстрации модели данных
 */
public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Mikhail");
        student.setPatronymic("Aleksandrovich");
        student.setSurname("Pushkarev");
        student.setGroup("17-ЭТКз");
        student.setDate("01.09.2017");

        System.out.println("My name is: " + student.getName() + " "  + student.getPatronymic() + " " +
                 student.getSurname() + " my group - " + student.getGroup() + " entered in - " +
                student.getDate());
    }
}
