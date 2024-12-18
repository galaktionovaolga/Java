package my_05_12_2024;

import java.util.Arrays;

public class MyArrayTasksWithStringsAndIntsB {

    // 11. Отсортировать массив строк по длине.
    public static void task11() {
        String[] array = {"elephant", "cat", "dog"};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].length() > array[j].length()) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    // 12. Найти и вывести все строки одинаковой длины.
    public static void task12() {
        String[] array = {"apple", "banana", "cherry", "dog", "cat"};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].length() == array[j].length()) {
                    System.out.println("Строки одинаковой длины: " + array[i] + " и " + array[j]);
                }
            }
        }
    }
    // !!13. Сравнить содержимое двух массивов целых чисел.
    public static void task13() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3, };
        //boolean areEqual = Arrays.equals(array1, array2);
        //System.out.println("Массивы равны: " + areEqual);
        boolean arrayEquals = true;
        if (array1.length != array2.length){
            arrayEquals = false; // массивы разной длины
        } else{
            for (int i = 0; i < array1.length; i++) {
                if(array1[i] !=array2[i]){
                    arrayEquals = false; //различные значения эл-в массива
                }

            }
        }
        System.out.println("Массивы равны: " + arrayEquals);
    }

    // !!14. Генерация нового массива из сумм элементов двух массивов.
    public static void task14() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int[] newArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i] + array2[i];
            }
        System.out.println(Arrays.toString(newArray));
    }

    // !15. Найти уникальные значения в массиве строк.
    public static void task15() {
        String[] array = {"apple", "banana", "apple", "lemon", "cherry", "banana"};
        boolean isUnique; //добавлена переменная, которая по умолчанию явл true для каждого элемента
        for (int i = 0; i < array.length; i++) {
            isUnique = true; //Предполагаем, что элемент уникален.
            for (int j = 0; j < array.length; j++) {

                if (array[i].equals(array[j]) && (i != j)) {
                    isUnique = false; //если нашли дубликат
                    break; // выходим из внутреннего цикла
                }
            }
            if(isUnique) {
                System.out.println(array[i]);
            }
        }
    }

    // 16. Удалить дубликаты из массива строк.
    public static void task16() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana"};

        boolean isDublicate = false;
        int countUnique = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (array[i].equals(array[j])){
                    isDublicate = true;
                    break;
                }
            }
            if (!isDublicate) {
                countUnique++;
            }
            isDublicate = false;
        }
        String[] arrayWithoutDublicates = new String[countUnique];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            isDublicate = false;
            for (int j = i - 1; j >= 0; j--) {
                if (array[i].equals(array[j])){
                    isDublicate = true;
                    break;
                }
            }
            if (!isDublicate) {
                arrayWithoutDublicates[k] = array[i];
                k++;
            }
        }
        System.out.println("arrayWithoutDublicates = " + Arrays.toString(arrayWithoutDublicates));
    }

    // 17 - не выводит(решение Нат). Объединить два массива строк в один.
    public static void task17() {
        String[] array1 = {"apple", "banana"};
        String[] array2 = {"cherry", "date"};
        String[] arrayCombined = new String[array1.length + array2.length];
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            arrayCombined[j] = array1[i];
            j++;
        }

        for (int i = 0; i < array2.length; i++) {
            arrayCombined[j] = array2[i];
            j++;
        }

        System.out.println(Arrays.toString(arrayCombined));
    }

    // 18!-. Проверить, упорядочен ли массив строк по алфавиту.
    public static void task18() {
        String[] array = {"apple", "banana", "cherry"};
        boolean isSorted = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                isSorted = false;
                break;
            }
        }

        System.out.println("Массив упорядочен: " + isSorted);
    }

    // !!19. Найти строки, начинающиеся с заданной буквы.
    public static void task19() {
        String[] array = {"apple", "banana", "apricot", "cherry"};
        char target = 'a';
        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(0) == target) {
                System.out.println(array[i]);
            }
        }
    }

    // !!20. Создать массив строк из первых букв элементов другого массива.
    public static void task20() {
        String[] array = {"apple", "banana", "cherry"};
        String[] newArray = new String[array.length];
        for (int i = 0; i < array.length; i++) {

            newArray[i] = String.valueOf(array[i].charAt(0));
        }
        System.out.println(Arrays.toString(newArray));

    }

    public static void main(String[] args) {
        task20();
    }
}
