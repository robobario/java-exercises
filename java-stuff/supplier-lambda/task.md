# Functional Java - Supplier lambda

Another useful class from `java.util.function` is Supplier.

```java
public interface Supplier<T> {
    T get();
}
```

You can create a supplier using lambda syntax like:
```() -> thingToReturn```

With this you can create a lambda expression that accepts an argument. Like in the task we use ```public Consumer<Integer> getBumper()``` to give us a Consumer that we can push integers on with `accept`.

# Task
Implement the `Consumer` in the `getCountSupplier` method, making it return `count`, then reimplement using a lambda expression instead of an anonymous class.