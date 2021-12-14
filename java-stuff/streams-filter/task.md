# Functional Java - Streams - Filtering

Filtering a stream is a common task. For example:
> given a list of demand partners, find all the active ones and invoke some method

Could be implemented like:
```java
partners.stream().filter(p -> p.isActive).forEach(e -> send(e));
```

# Task
Implement `sumOfOddNumbers` making it filter out even numbers. Then convert the anonymous class to a lambda.

Note: this uses another function interface `Predicate` with interface
```java
public interface Predicate<T> {
    boolean test(T var1);
}
```
So when you filter it is taking each element from the stream and under the hood the stream will be using `test` to see if the element should be removed from the stream.