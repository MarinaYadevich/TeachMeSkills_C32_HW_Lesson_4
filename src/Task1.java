/* 1. Создайте массив целых чисел. Удалите все вхождения заданного
числа из массива.
Пусть число задается с консоли (класс Scanner). Если такого числа нет -
выведите сообщения об этом.
В результате должен быть новый массив без указанного числа.
 */
 import java.util.Arrays;
 import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
         int[] values = {3, 90, 45, 89, 6, 54};
         Scanner sc = new Scanner(System.in);

         System.out.println("Первоначальный массив чисел: " + Arrays.toString(values));
         System.out.print("Введите число для удаления в массиве: ");

        int a = sc.nextInt();
        sc.close();

        int pos = Arrays.binarySearch(values, a);
         // System.out.println(pos);

        if(pos < 0){
            System.out.println("Заданного числа нет в массиве.");
        }else{
            int[] values1 = new int[values.length - 1];
            // System.out.println(values1.length);

            int index = 0;
            for (int value : values) {
                if (value != a) {
                    values1[index++] = value;
                }
            }
            System.out.println("Массив после удаления числа: " + Arrays.toString((values1)));
        }
    }
}
