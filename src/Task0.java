/* 0. Создайте массив целых чисел. Напишете программу, которая выводит
сообщение о том, входит ли заданное число в массив или нет.
Пусть число для поиска задается с консоли (класс Scanner).
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 8, 90, 67, -23}; // Создали массив целых чисел
        Scanner sc =  new Scanner(System.in); // Создали обьект типа Scanner
        int a = sc.nextInt(); // создали переменную целочисленного типа вводимое с консоли
        // System.out.println(a);
        Arrays.sort(numbers); // отсортировали массив
        // System.out.println(Arrays.toString(numbers));
        int pos = Arrays.binarySearch(numbers, a); // ищем заданное число в массиве
        // System.out.println(pos);

        if(pos >= 0){
            System.out.println("Заданное число входит в массив");
        }else{
            System.out.println("Заданное число не входит в массив");
        }
        System.out.println("End");

    }
}
