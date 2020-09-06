/*Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным, кроме каждого
100-го, при этом каждый 400-й – високосный. Для проверки работы вывести результаты работы метода в консоль.*/

import java.util.Scanner;

public class task15 {
    public static void main(String[] arg){
        System.out.println("Введите значение года");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        tasc_15(year);
    }
    private static void tasc_15(int year){
       if((year % 400 == 0) || (year % 4 ==0 && year % 400 != 0 && year % 100 != 0)){
            System.out.println("Год високосный");
        }else if((year % 400 != 0 && year % 100 == 0) || (year % 4 != 0 && year % 400 != 0 && year % 100 !=0) ||
                (year % 4 == 0 && year % 400 != 0 && year % 100 == 0)){
            System.out.println("Год не високосный");
        }
    }
}
// в данной программе не учитываются исторические события стран и их летоисчисления. :)