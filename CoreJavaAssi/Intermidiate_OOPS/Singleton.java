package Assigment.CoreJavaAssi.Intermidiate_OOPS;

public class Singleton {

    private Singleton() {
        System.out.println("Singleton Constructor");
    }

    static class Driver extends Singleton {
        public static void main(String[] args) {

        }
    }

}
