import java.lang.annotation.Retention;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        String firstName = " Ivanov ";
        String middleName = " Ivan ";
        String lastName = " Ivanovich ";
        String fullName = firstName + middleName +lastName;{
            System.out.println("ФИО сотрудника - "+ fullName);
        }
        // Задача 2
        String s1 = fullName.toUpperCase();
        System.out.println("ФИО сотрудника - " + s1);
        // Задача 3
        String fullName1 =  "Иванов Семён Семёнович";{
            fullName1 = fullName1.replace('ё', 'е');
            System.out.println(fullName1);
        }




    }

}