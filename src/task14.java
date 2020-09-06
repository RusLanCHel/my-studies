/*Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вернуть
приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.*/

import java.util.Scanner;

public class task14 {
    public static void main(String[] arg){
        System.out.println("Введите свое имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        task_14(name);
    }
    private static void task_14(String a){
        System.out.println("Привет, " + a + "!");
    }
}
