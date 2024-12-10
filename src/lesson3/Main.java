package lesson3;

import java.util.Random;

public class Main {

    public static  int  getRandomStudent( int quantity){

//        if ( quantity <= 1){
//
//            throw new IllegalArgumentException("Должно быть как мимимум 2 участника");
//        }

        Random random = new Random();
        return random.nextInt(quantity - 1) + 2;
    }

    public static void main(String[] args) {
        int  quantity = 9;
        int selectedStudent = getRandomStudent(quantity);


        System.out.println("Случайно выбран студент: " + selectedStudent);
    }
}
