package lesson2;

public class Homework  {
    public static void main(String[] args) {
        String myString = new String("I study Basic Java!");

        printString(myString);

        char lastChar = myString.charAt(myString.length() - 1);

        System.out.println("Последний символ строки: " + lastChar);

        boolean constainsJava = myString.contains("Java");
        System.out.println("Содержит ли строка 'Java': " + constainsJava);

        String replacedString = myString.replace('a', 'o');
        System.out.println("Строка после замены: " + replacedString);


        String upperCaseString = myString.toUpperCase();
        System.out.println("Строка в верхнем региствре: " + upperCaseString);


        String lowerCaseString = myString.toLowerCase();
        System.out.println("Строка в  нижнем региствре: " + lowerCaseString);


        int startIndex = myString.indexOf("Java");

        if (startIndex != -1) {
            String substring = myString.substring(startIndex, startIndex + 4);
            System.out.println("Вырезанная строка: " + substring);
        } else {
            System.out.println("Подстрока 'Java' не найдена");
        }

    }
            public static  void printString(String str){
                System.out.println("Переданная строка: " + str);

    }
}
