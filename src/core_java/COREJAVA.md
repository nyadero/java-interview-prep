### Why is java not a purely Object-Oriented-Programming Language
    For a language to be considered an OOP language. it must satisfy the following:
    1. Encapsulation/Data Hiding
    2. Inheritance
    3. Polymorphism
    4. Abstraction
    5. All predefined types are objects
    6. All user defined types are objects
    7. All operations performed on objects must be only through methods exposed at the objects

    Java is not a purely OOP language because it has 8 primitive data types that are not objects. 
    Java also has static variables and methods

### JDK(Java Development Kit), JRE(Java Runtime Environment), JVM(Java Virtual Machine)
    JDK is for development purposes
    JRE is for running java programs
    Both JDK and JRE have JVM which enables us to run our java programs
    JVM is the heart of java programming language and provides platform independence

### Why is the main() method public static
    It is static so that the JVM can invoke it without instantiating the class's object.
    If the main() method is non-static, then the JVM needs to create an instance of the class and there would 
    be ambiguity if the constructor of that class takes an argument.

    Why public? 
    Anyone can access/invoke any method having the public access modifier. The main() method has to be public so
    that it can be invoked by the JVM. 

### Can we overload the main() method in java?
    Yes, the main method can be overloaded. A java class can have any number of main() methods. But to run the
    java class, it should have a main() method with the following signature public static void main(String[] args)

### Can we declare the main() method as private or protected or with no access modifier?
    No, the main() method must be public, Defining the method as private, protected or with no access modifier makes
    it inaccessible to the JVM and thus cannot be invoked.

### Can we declare the main() method as non-static?
    No, the main() method must be static so that the JVM can invoke it without instantiating its class. removing the
    "static" keyword from the method makes the program fail at runtime.

### Can the main() method take other arguments other than String array?
    No, an argument of the main() method must be of String array

### Can we run a java class without the main() method?
    No, the main() method is the entry point as from java 7. In previous releases of java we had static initializers as
    alternatives i.e

    public class Main{
       static{
          System.Out.Println("Static initiliazer");
          System.exit(0);
       }
    }

### Can we make the main method as final in java?
    Yes, we can make it final

    