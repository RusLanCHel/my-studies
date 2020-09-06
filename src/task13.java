/*Написать метод, которому в качестве параметра передается целое число, метод должен проверить положительное ли число
передали, или отрицательное. Замечание: ноль считаем положительным числом. Результат работы метода
вывести в консоль.*/

import java.util.Scanner;

public class task13 {
    public static void main(String[] arg){
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        task_13(a);
    }
    private static void task_13(int a){
        if(a < 0){
            System.out.println("Ваше число отрицательное");
        }else{
            System.out.println("Ваше число положительное");
        }
    }
}
