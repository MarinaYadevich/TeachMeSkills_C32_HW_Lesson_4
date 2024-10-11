/*  3. Создайте 2 массива из 5 чисел.
Выведите массивы на консоль в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и
сообщите, для какого из массивов это значение оказалось больше (либо
сообщите, что их средние арифметические равны).
 */


import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] values = {9, 56, 445, 71, 3};
        int[] values1 = {78, 1, 67, 4, 2};

        System.out.println("Values: " + Arrays.toString(values));
        System.out.println("Values1: " + Arrays.toString(values1));
        System.out.println();

        double sum = 0;
        for(double value: values){
            sum += value;
        }
        // System.out.println(sum);

        double mean = sum / values.length;
        // System.out.println(mean);

        double sum1 = 0;
        for (double value1: values1){
            sum1 += value1;
        }
        // System.out.println(sum1);

        double mean1 = sum1 / values1.length;
        // System.out.println(mean1);

        if(mean > mean1) {
            System.out.println("Среднее арифметическое values больше среднего арифметического values1.");
        }if(mean < mean1) {
               System.out.println("Среднее арифметическое values1 больше среднего арифметического values.");
           }if(mean == mean1){
                    System.out.println("Средние арифметические двух массивов равны.");
                }
    }
}
