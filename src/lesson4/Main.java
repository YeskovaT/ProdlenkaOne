package lesson4;

public class Main {

//    static boolean bool = true;
//    static int a = 13;

//    public static void main(String[] args) {

//        if (a == 3) {
//            System.out.println(" a=3");
//        } else if (a < 3) {
//            System.out.println("a < 3");
//        } else if (a > 3) {
//
//            System.out.println("a > 3");
//
//        int a = 5;
//        int b = 15;
//        boolean bool = false;
//         || - или   ! - "не"
//          if (a == b || !bool ){
//            System.out.println("It is true");

//

//    Dog dog = new Dog();
//
//    dog.setAge(743);
//
//    System.out.println( dog.getAge());
//
//    dog.setName("Bist");
//
//        System.out.println(dog.getName());

        public static void findEvenOdd(int num)  {
            if (num % 2 == 0) {
                System.out.println(num+  " is even"); }
            else  {
                System.out.println(num+   " is odd");  }
        }
        public static void main (String[] args)  {
            findEvenOdd(2);
            findEvenOdd(4);
            findEvenOdd(5);
        }

    }
