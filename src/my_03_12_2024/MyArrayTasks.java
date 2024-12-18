package my_03_12_2024;

import java.util.Arrays;

public class MyArrayTasks {

    // 1. Найти сумму элементов массива.
    public static void task1() {
        int[] array = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        System.out.println(sum);
    }

    // 2. Найти минимальный элемент массива.
    public static void task2() {
        int[] array = {4, 2, -1, 7};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    // 3. Найти максимальный элемент массива.
    public static void task3() {
        int[] array = {4, 2, -1, 7};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    // 4. Найти индекс минимального элемента массива.
    public static void task4() {
        int[] array = {4, 2, -1, 7};
        int min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println(minIndex);

    }

    // 5. Найти индекс максимального элемента массива.
    public static void task5() {
        int[] array = {4, 2, -1, 7};
        int max = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                array[i] = max;
                maxIndex = i;
            }
        }
        System.out.println(maxIndex);
    }

    // 6. Посчитать количество положительных элементов.
    public static void task6() {
        int[] array = {4, -2, 0, 7, 7};

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    // 7. Посчитать количество отрицательных элементов.
    public static void task7() {
        int[] array = {4, -2, 0, -7};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <0){
                count++;
            }

        }
        System.out.println(count);
    }

    // 8. Посчитать количество четных элементов.
    public static void task8() {
        int[] array = {4, -2, 0, 7};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }

        }
        System.out.println(count);

    }

    // 9. Посчитать количество нечетных элементов.
    public static void task9() {
        int[] array = {4, -2, 0, 7};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 !=0) {
                count++;
            }

        }
        System.out.println(count);
    }

    // 10. Проверить, есть ли в массиве заданное число.
    public static void task10() {
        int[] array = {4, -2, 0, 7};
        int target = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == target){
                System.out.println("есть число");
            }
        }
    }

    // 11. Найти среднее арифметическое элементов массива.
    public static void task11() {
        int[] array = {1, 2, 3, 4};
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum / array.length);

    }

    // 12. Вывести все элементы массива, которые больше среднего значения.
    public static void task12() {
        int[] array = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        int avg = sum / array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > avg) {
                System.out.println(array[i]);
            }
        }
    }

    // 13. Проверить, упорядочен ли массив по возрастанию.
    public static void task13() {
        int[] array = {1, 2, 3, 4};
    }

    // 14. Найти второй по величине элемент массива.
    public static void task14() {
        int[] array = {1, -2, 3, -4};
        int min = array[0];
        int secMin = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                secMin = min;
                min = array[i];
            }
            if (array[i] < secMin && array[i] > min) {
                secMin = array[i];
            }
        }
        System.out.println(secMin);


    }

    // 15. Переставить элементы массива в обратном порядке.
    public static void task15() {
        int[] array = {1, 2, 3, 4};
        int reset = 0;
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length -1 -i];
            array[array.length -1 -i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }


    public static void main(String[] args) {
        task15();
    }


}
