### What is an array?
    An array is a data structure that defines an indexed and fixed in size collection of homogeneous data elements. 
    The size of an array is fixed and cannot be changed after it is created.

### What is the advantage and disadvantage of array?
    Advantage of array is that:
    - we can store multiple values in a single variable instead of declaring separate variables for each value.
    - we can access any element randomly using the indexes provided by arrays
    - we can sort multiple elements of the array at the same time
    Array disadvantages:
    - Size limit : we can store a fixed size of elements in an array
    - we cannot store different types of data in an array

### What are types of array in Java?
    1. Single Dimensional Array (the array contains sequential elements of the same data type)
    2. Multiple Dimensional Array (an array of arrays)

### Can you pass the negative number in array size?
    No, passing the negative number does not give a compiler error but it gives NegativeArraySizeException at runtime.

### When does ArrayOutOfIndexBoundException occur?
    It occurs when an attempt is made to access an element with illegal index. Illlegal index means either it is negative
    or greater than or equal to the size of the array. 

### Difference between array and arraylist
    1. An array is static in nature, its size is fixed while an arraylist is dynamic, its size grows as elements are added
    2. An array can contain both primitive and Object data types while an arraylist does not containt primitive data
       types(primitive wrapper classes). It contains object entries.
    3. We use add() method to insert an element into an arraylist and assignment operator to store elements in array
    4. We cannot use generics with arrays whereas in arraylist we use generics to ensure type safety

### What is an anonymous array in java
    An anonymous array is an array without a name/reference. They are useful for scenarios where we ne need one-time
    usage of the array.

