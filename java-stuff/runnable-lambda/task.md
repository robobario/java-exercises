# Functional Java - Runnable lambda

To dodge the boilerplate java 8 introduced the lambda expression syntax. This is a shorthand syntax for the same kind of anonymous class creation. So you replace:
```java
Runnable runnable = new Runnable() {
    @Override
    public void run() {
        // do a thing
    }
};
```
With
```java
Runnable runnable = () -> {};
```

And the compiler is able to infer the types and create the anonymous class.

# Task

Implement the runnable again to bump the dirty static `count` field but this time replace it with a lambda expression.

Note: you will find these interfaces are used by some java APIs like the streams api so you can conveniently use lambda expressions on streams. More on that later.