# Arrays

From the [java tutorial](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
> An array is a container object that holds a fixed number of values of a single type. 

Some basic usage:
```java
int[] array = new int[10]; 
array[0] = 2;
System.out.println("Element at index 0: " + array[0]);
```

There are many utility methods for working with Arrays in [java.util.Arrays](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html).

Arrays have been there from the beginning of Java and one of their strengths is that you can create arrays of primitive types like `int[]` and `byte[]`. Then you can work with primitives without having to convert to the boxed form and back. So arrays can be used tactically for performance reasons. 

Also third party libraries may consume and produce arrays and you'll have to deal with them.

The downside of arrays is that an array is quite a specific implementation detail. It has a fixed size, so is not so useful if you need something that grows and shrinks. It has all the performance benefits and limitations of an array. 

So if you program against arrays you are stuck with arrays. We will look at the Collections api next which, in general, should be your go to if you need a container.

# Task

`sum` the elements of `array`. Arrays can be iterated with `for (int i : array) {` or 
```java
for (int i = 0; i < array.length; i++){
    int i1=array[i];
}
```