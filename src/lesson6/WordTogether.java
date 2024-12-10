package lesson6;

import java.util.Scanner;

public class WordTogether {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите первое слово: ");
        String word1 = scanner. nextLine();

        System.out.println("Введите второе слово: ");
        String word2 = scanner.nextLine();


        if (word1.length() % 2 ==0 && word2.length() % 2 ==0){
            String result = word1.substring(0, word1.length() / 2) + word2.substring(0, word2.length() / 2);

            System.out.println("Результат: " + result);
        } else {
            System.out.println("Оба слова должны иметь четное количество букв: " );
        }
    }
}
