# Functional Java - Function lambda

The next great class from `java.util.function` is Function.

```java
public interface Function<T, R> {
    R apply(T var1);
}
```

So it is an interface with a method that takes a thing of type T and returns something of type R.

You can create a function using lambda syntax like:
```arg1 -> thingToReturn```


# Task
Implement the `Function` in the `multiplyCount` method, making it multiply `count` by `integer`, then reimplement using a lambda expression instead of an anonymous class.