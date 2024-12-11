package prodlenka;

import java.util.Arrays;

public class MassiveHouseTwo {

    // 11. Отсортировать массив строк по длине.
    public static void task11() {
        String[] array = {"elephant", "cat", "dog"};
        Arrays. sort( array, (s1, s2) -> s1.length() - s2.length());
        System.out.println(Arrays.toString(array));
    }

    // 12. Найти и вывести все строки одинаковой длины.
    public static void task12() {
        String[] array = {"apple", "banana", "cherry", "dog", "cat"};
        //   System.out.println("Строки одинаковой длины");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].length() == array[j].length()) {
                    System.out.println(array[i] + " и " + array[j]);
                }
            }
        }
    }

    // 13. Сравнить содержимое двух массивов целых чисел.
    public static void task13() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        boolean isEqual = true;

        if (array1.length != array2.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    isEqual = false;
                    break;
                }
            }
        }
        if (isEqual) {
            System.out.println("Массивы  равны ");
        } else {
            System.out.println("Массивы не равны");
        }
    }

    // 14. Генерация нового массива из сумм элементов двух массивов.
    public static void task14() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int[] result = new int[array1.length];

        for (int i = 0; i < array2.length; i++) {
            result[i] = array1[i] + array2[i];

        }
        System.out.println(Arrays.toString(result));
    }

    //   15. Найти уникальные значения в массиве строк.
    public static void task15() {
        String[] array = {"apple", "banana", "apple", "chery", " banana"};

        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i].equals(array[j])){
                    isUnique = false;
                    break;
                }
            }
            if (isUnique){
                System.out.println(array[i]);
            }
        }

    }

    // 16. Удалить дубликаты измассива строк.

    public static void task16() {
        String[] array = {"apple", "banana", "apple", "chery", " banana"};

        String[] tempArray = new String[array.length];
        int uniqueCount = 0;

        for (int i = 0; i < array.length; i++) {

            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (array[i].equals(tempArray[j])){
                    isDuplicate = true;
                    break;
                }
            }
        }


}

public static void main(String[] args) {
    task11();
    task12();
    task13();
    task14();
    task15();
    task16();

}
}

