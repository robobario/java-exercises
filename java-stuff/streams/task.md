# Functional Java - Streams

The functional and lambda classes also arrived with the Java streams api. See the [package docs](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html) for some more on the motivation behind streams.

This API enables us to write concise functional code manipulating streams of data. For example we might wish to stream over all the values of a list, log out each value, multiply it by a number, then collect the result into a hashset.

Instead of looping over the list and doing the work in the loop we could use the streams API like this:

```java
listOfInts.stream()
        .peek(integer -> log(integer))
        .map(integer -> integer * 3)
        .collect(Collectors.toSet())
```

Note that methods like `map` use the interfaces we worked with earlier. Map takes a Function like:
```java
<R> Stream<R> map(Function<? super T, ? extends R> mapper);
```
ignoring the generic types for now it takes a T and maps it to an R. So you can use `map` to change from a Stream<Integer> to a String<String> just by returning a String from the lambda.

# Task
Implement `multiplyAllAndSum` making it multiply each of the elements of the input collection and then sum the results. Then reimplement using a lambda expression instead of an anonymous class.

Note that using `mapToInt` returns a specialised `IntStream` which gives you the convenient `sum` method to add up the elements of the stream.