/*Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах
от 10 до 20(включительно), если да – вернуть true, в противном случае – false.*/

import java.util.Scanner;

public class task12 {
    public static void main(String[] args){
        /*boolean check = true;*/
        System.out.println("Введите два целых числа");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(task_12(a, b)){
            System.out.println("Ваша сумма чисел находится в пределах от 10 до 20, включительно");
        }else{
            System.out.println("Ваша сумма чисел находится за пределами от 10 до 20");
        }
    }
    private static boolean task_12(int a, int b){
        return (a + b >= 10 && a + b <= 20);
    }

}
