# Functional Java - Consumer lambda

Lambdas can be used to make functions for any single method class/interface. The `java.util.function` package supplies some convenient classes that are lambda compatible.

One of those is the `Consumer` class:

```java
public interface Consumer<T> {
    void accept(T var1);
}
```

You can create a consumer using lambda syntax like:
```java
() -> thingToReturn
```

# Task
Implement the `Supplier` in the `getBumper` method, then reimplement using a lambda expression instead of an anonymous class.