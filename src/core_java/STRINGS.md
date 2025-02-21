### 1. What is a string in java?
    A string is a sequence of characters. A string is immutable(once created its content cannot be changed)
    It is an object and not a primitive data type like int, long or double

### 2. What are the different ways of creating a string?
    There are two ways of creating a string in java:
    1. Using String literals
    2. Using new keyword
Using String literal
```java
   String message = "Hello";
```
Using new keyword
```java
String message = new String("Hello");
```

### 3. What do you mean by mutable and immutable objects
    Immutable objects are like constants, once created their values cannot be changed.
    Mutable objects on the other hand can have their values changed/updated/modified once created.
    For example String is immutable, once created they cant be modified. StringBuilder or StringBuffer is mutable
    and can be modified once an object of StringBuilder/StringBuffer is created.

### 4. What is String constant Pool?
    A string constant pool is the memory space in heap memory that is specially allocated to store the string objects
    created using the string literal. In String Constant Pool, there will be no two string objects having the same
    content

### 5. Is String thread-safe in java?
    Yes, Strings are immutable by default, hence thread-safe

### 6. Difference between == and equals() in Java
    1. == is an operator while equals() is a method
    2. We can use == for reference comparison(address comparison) and equals() for content comparison ie == operator
        checks if both objects point to the same memory location while equals() checks if both objects have the same
        content.
```java
public class Test{
    public static void main(String[] args){
        String m1 = "HELLO";
        String m2 = "HELLO";
        System.out.println(m1==m2);
        System.out.println(m1.equals(m2));
    }
}
```

#### Output
    false
    true

### 7. Difference between String and StringBuilder
    1. A String is immutable while StringBuilder is immutable
    2. A String is thread-safe while StringBuilder is not thread-safe
    3. A String class overides the equals() method of Object class, meaning we can compare the contents of two strings
        using equals() method. StringBuilder does not override the equals() method.
    4. The performance of the String class is slower than that of StringBuilder when there are multiple concatenation
        operations being performed.This is because a String class is immutable and concatenation involves creating new 
        object

### 8. Difference between String and StringBuffer
    1. String is immutable, StringBuffer is mutable
    2. String is  slower and consumes more memory when performing multiple concatenation operations as compared to
        StringBuffer.
    3. A String class overides the equals() method of Object class, meaning we can compare the contents of two strings
        using equals() method. StringBuffer does not override the equals() method.
    4.  A String uses the String Constant Pool to store its objects while StringBuffer uses the heap memory.

### 9. Difference between StringBuilder and StringBuffer
    1. A StringBuffer is slower than the StringBuilder

### 10. Which one will you prefer between == operator and equals() method to compare two strings.
    I would choose equals() over == operator as it compares the strings based on their contents which is more logical
    than comparing the memory address of the two strings. == operator can be used but it is not ideal for most scenaros

### 11. What does the String inter() method do?
    the intern() method creates an exact copy of the String object in the heap memory and stores it in the String Constant
    Pool. Note that if another String with the same content exists in the pool, then a new object won't be created and the
    new reference will point to the other string.

### 12. Why is String a popular HashMap key in Java?
    Since it is immutable, its hashcode is cached at the time of creation and it doesn't need to be calculated again,
    making it a greater candidate for a map key and its processing is fast compared to other objects.

### 13. How may objects will be created in the following code example and where will they be stored?
```java
  String s1 = new String("hello");
  String s2 = "hello";
```
#### Answer
    Two objects will be created. The object s1 created using new keyword will be stored in heap memory and the other s2
    created using string literal will be stored in the String Constant Pool.

### 14. 