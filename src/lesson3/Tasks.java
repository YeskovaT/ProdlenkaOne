package lesson3;

public class Tasks {
    public static void main(String[] args) {
        double a = 4.8;
        double b = 7.5;

       System.out.println (a + " " + b);
//  это без пояснений

       double temp = a;
        a = b;
        b = temp;


// это с пояснениями
        System.out.println("После обмена: a = " + a + ", b = " + b);

    }
}
