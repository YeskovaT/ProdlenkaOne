package lesson1;

public class Cat {

   public String name;
   public int age;

    public void meow() {
        System.out.println("Мяу! Меня зовут " +  name + "!");

    }

    public void info(){
        System.out.println("Имя: " + name);
        System.out.println("Возраст:" + age + " лет");
    }
}
