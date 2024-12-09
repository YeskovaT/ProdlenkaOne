package prodlenka;

public class ProdlenkaOne {

    public static void task1() {
        int[] array = {1, 2, 3, 4};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }

        System.out.println(sum);
    }


    //    2. Найти минимальный элемент массива.
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

            if (array[i] > max) {
                max = array[i];
            }

        }
        System.out.println(max);
    }


    // 4. Найти индекс минимального элемента массива.
    public static void task4() {
        int[] array = {4, 2, -1, 7};

        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        System.out.println(index);

    }

    // 5. Найти индекс максимального элемента массива.
    public static void task5() {
        int[] array = {4, 2, -1, 7};
        int max = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println(index);

    }

    // 6. Посчитать количество положительных элементов.
    public static void task6() {
        int[] array = {4, -2, 0, 7};
        int positiveCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveCount++;
            }
        }
        System.out.println(positiveCount);
    }

    // 7. Посчитать количество отрицательных элементов.
    public static void task7() {
        int[] array = {4, -2, 0, -7};
        int negativeCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println(negativeCount);
    }

    // 8. Посчитать количество четных элементов.
    public static void task8() {
        int[] array = {4, -2, 0, 7};
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println(evenCount);

    }

    // 9. Посчитать количество нечетных элементов.
    public static void task9() {
        int[] array = {4, -2, 0, 7};
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }

        System.out.println(oddCount);
    }

    // 10. Проверить, есть ли в массиве заданное число.
    public static void task10() {
        int[] array = {4, -2, 0, 7};
        int target = 0;
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                found = true;
            }
        }
        if (found) {
            System.out.println("Число " + target + "присутствует в массиве.");

        } else {
            System.out.println("Число " + target + "отсутствует в массиве.");
        }
    }

    // 11. Найти среднее арифметическое элементов массива.
    public static void task11() {
        int[] array = {1, 2, 3, 4};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        double summa = (double) sum / array.length;
        System.out.println(summa);
    }

    // 12. Вывести все элементы массива, которые больше среднего значения.
    public static void task12() {
        int[] array = {1, 2, 3, 4};

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        double summa = (double) sum / array.length;
        System.out.println(summa);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > summa) {
                System.out.println(array[i]);
            }
        }

        // 13. Проверить, упорядочен ли массив по возрастанию.
            public static void task13() {
            int[] array = {1, 2, 3, 4, 5};
            boolean sort = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    sort = false;
                    break;
                }
            }
            if (sort) {
                System.out.println("Массив упорядочен по возрастанию");
            } else {
                System.out.println("Массив не упорядочен");
            }
        }

        // 14. Найти второй по величине элемент массива.      {Нужно пояснение решения}
        public static void task14() {
            int[] array = {1, 2, 3, 4};

        }

        // 15. Переставить элементы массива в обратном порядке. { Нужно пояснение решения}
        public static void task15 () {
            int[] array = {1, 2, 3, 4};
        }
    }

//
//    int sum = 0;
//        for(
//    int i = 7;
//    i <=98;i=i+7)
//
//    {
//        System.out.print(i + " ,");

//        sum = sum + i;
//    }
//        System.out.print(sum);
//
//
//    Scanner scanner = new Scanner(System.in);
//    int sum = 0;
//    int nummer = scanner.nextInt();
//
//        for(
//    int i = 0;
//    i<nummer;i =i +2)
//
//    {
//
//        sum = sum + i;
//
//    }
//        System.out.println(sum);
//
//
//    Scanner scanner = new Scanner(System.in);
//    int sum = 0;
//    int nummer = scanner.nextInt();
//        for(
//    int i = 0;
//    i<nummer;i++)
//
//    {
//        if (i % 2 == 0) ;
//
//        sum = sum + i;
//
//    }
//        System.out.println(sum);
//
//
//        Необходимо вывести на консоль такую последовательность чисел:
//        1 2 4 8 16 32 64 128 256 512
//        int mult = 0;
//        for (int i = 1; i <= 512; i= i * 2) {

//
//            System.out.print(i + " ");
//
//        }
//
//        int n = 1;
//        while (n <= 512) {
//
//            System.out.println(n);
//            n = n * 2;
//        }
//
//
//    String[] array = {"g", "cat", " elefant", "dog", " f"};
//
//    String minLenghtStringt = array[0];
//
//        for(
//    int i = 0;
//    i<array.length;i++)
//
//    {
//        if (array[i].length() < minLenghtStringt.length()) {
//            minLenghtStringt = array[i];
//        }
//
//    }
//System.out.println(minLenghtStringt);

    public static void main(String[] args) {
        task1();
    }
}
