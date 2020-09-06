/*Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
где a, b, c, d – целочисленные входные параметры этого метода.*/

import java.util.Scanner;

public class task11 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Мы будем считать значение - a * (b + (c / d)), вводные данные целые числа");
        System.out.println("Введите значение переменных - a b c d");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        float c = scanner.nextInt();
        int d = scanner.nextInt();

        task1_1(a, b, c, d);
    }
    private static float task1_1(int a, int b, float c, int d){
        if (d == 0){
            System.out.println("На ноль делить нельзя!");
            return 0;
        }
        float result = a * (b + (c / d));
        System.out.println("Значение функции = " + result);
        return result;
    }
}
