
import java.util.Arrays;
import java.util.Scanner;

/** 2. Создайте и заполните массив случайными числами и выведете
 * максимальное, минимальное и среднее значение.
 * Для генерации случайного числа используйте метод Math.random().
 * Пусть будет возможность создавать массив произвольного размера.
 * Пусть размер массива вводится с консоли.
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int[] numbers = new int[sc.nextInt()];
        sc.close();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random()  * 100); //Генерируем случайное число от 0 до 99
        }
        System.out.println(Arrays.toString(numbers));

        int max = numbers[0]; // инициализация max первым элементом массива
        // System.out.println(max);
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Максимальное значение в массиве: " + max);

        int min = numbers[0]; // инициализация min первым элементом массива
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Минимальное значение в массиве: " + min);

        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
       // System.out.println(sum);
        double average = sum / numbers.length;
        System.out.println("Среднее значение массива: " + average);
    }
}
