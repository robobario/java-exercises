# Functional Java - Runnable

Java gives you the ability to create anonymous classes defined inline. For example when you write:

```java
Runnable runnable = new Runnable() {
    @Override
    public void run() {
        // do a thing
    }
};
```

You are creating an anonymous inner class which implements Runnable. The java compiler implicitly creates that class for you at compilation time.

Java's been able to do that for ages.

But. It's ugly, a lot of boilerplate especially if you just want the implementation to be a one-liner implementation of some method.

# Task

Implement the anonymous Runnable to bump the dirty static `count` field. Resist the IDE suggesting converting it to a lambda :) do it the ugly way.