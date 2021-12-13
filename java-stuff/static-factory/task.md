# Static Factory

A common pattern you will bump into is using static methods to construct instances of class. This is cool and useful because the static factory hides the constructor, allowing you to refactor the class more easily.

for example:
```java
public static Result create(boolean success){
    return new Result(success);
}
```
if you want to change success to an enum it would be a breaking change for clients. The static factory allows you to keep the old contract working with:
```java
public static Result create(boolean success){
    return new Result(success ? Enum.SUCCESS : Enum.FAILURE)
}
```



Also the static methods could return an interface and hide the concrete implementation like:

```java
public static Collection<String> getKeywords(){
    return new SuperCustomListImplementation();
}
```

So that clients will be forced to code against the Collection interface and not be prompted to use or extend the implementation class.

You could also do your own smart code to control whether a brand new instance is created, or if a shared one could be returned.

# Task

Update the `create` method to use the `static` jarPool to cache one Jar per maxSize. See the [computeIfAbsent](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html#computeIfAbsent-K-java.util.function.Function-) method. Or you can use and old-school `map.get(x)`, return if non-null else create and `put` in map and return it.

i.e `create(2) == create(2)` should be true.