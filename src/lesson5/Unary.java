package lesson5;

import java.util.Random;

public class Unary {
    public static void main(String[] args) {


//    private int number;
//
//    public void doMinus()  {
//        number = -number;
//    }
//
//    public void  decrement()  {
//      number--;
////      number = number - 1;
//    }
//    public void increment() {
//        number++;
//    }
//
//    public Unary(int number)  {
//        this.number= number;
//    }
//
//
//  public int getNumber(){
//    return number;
//    }
//
//    public void setNumber(int number) {
//        this.number = number;
//    }
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        int c = random.nextInt();
        int d = random.nextInt();

        if ((a < b) && (b == c)) {
            System.out.println("а меньше б и б  равно с : Правда");
        } else {
            System.out.println("а меньше б и б равно с: Ложь");
        }

        if ((a > b) || (c == d)) {
            System.out.println("а больше б и с равно д: Истина");
        } else {
            System.out.println("а больше б и с равно д: Ложь");
        }

        if ((a != b)) {
            System.out.println("а не равно б: Истина");
        } else {
            System.out.println("а не равно б: Ложь");
        }
    }

}
