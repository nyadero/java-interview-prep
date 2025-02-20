package core_java;

public class IsJavaFullyOOP {
    private static String name = "java";
    public static void main(String[] args) {
//        primitive data types
        int i = 10;
        byte b = 1;
        float f = 209.00F;
        long l = 5726L;
        double d = 562.90;
        char c = 'c';
        boolean bool = true;
        short s = 30;

        System.out.println(i);
        System.out.println(b);
        System.out.println(f);
        System.out.println(l);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);
        System.out.println(s);

//        Integer integer = new Integer(56);
//        System.out.println(integer);

        // calling name instance variable without object
        System.out.println(name);

        // calling static method without object
        greetUser();
    }

    static void greetUser(){
        System.out.println("hello");
    }


}
