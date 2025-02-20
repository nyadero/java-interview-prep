package core_java;

public class MainMethodOverloading {
    public static void main(String[] args) {
        System.out.println("String[] args main method");
    }

    public static void main(int... args) {
        System.out.println("int[] args main method");
    }

    public static void main(char[] args) {
        System.out.println("char[] args main method");
    }

}
