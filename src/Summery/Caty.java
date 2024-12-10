package Summery;



    public class Caty {
        private String name;
        private int age;


        public Caty(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Caty() {
        }

        @Override
        public String toString() {
            return "Caty{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void meow() {
            System.out.println("кот по кличке: " + name + " начал мяукать!");
        }

        public void jump() {
            System.out.println("кот по кличке: " + name + " начал прыгать!");
        }
    }

