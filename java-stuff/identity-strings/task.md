# Reference equality vs Object::equals 2

Another example that could trip you is the String. You should use the equals method to check if the strings are logically equal. Often the compiler is smart enough to reuse the same string object. Like:

```java
String a = "hello";
String b = "hello";
```

It is likely a and b point to the same String on the heap because they get put into a pool of constants. So `a == b` will be true.

But `new String("hello") == "hello"` will return false, because you are explicitly creating a new String object on the heap and comparing to the constant one.

# Task

Change EqualityChecker to call the `equals` method instead of using `==` so that `EqualityChecker.equals("a", new String("a"))` returns true.