package Summery;



public class Main {
        public static void main(String[] args) {
            Caty cat = new Caty("Барсик", 5);
            Caty catTwo = new Caty();
            Caty catThree = null;// NPE
            Caty catFour = generateCat();
            catTwo.setName("Тихон");
            catTwo.setAge(6);
            catThree = cat;
            cat.setAge(15);
            System.out.println("catThree = " + catThree);
            System.out.println("cat = " + cat.toString());
            System.out.println("catTwo = " + catTwo);
            System.out.println("catThree = " + catThree);
            System.out.println("catFour = " + catFour);
            cat.meow();
            catTwo.meow();
            catTwo.jump();
            catFour.jump();
        }

        private static Caty generateCat() {
            return new Caty();
        }
    }

