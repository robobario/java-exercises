# Functional Java - Streams - Filtering Nulls

A common thing you may need to deal with is removing nulls from a stream. For whatever reason if you have nulls in the stream you can filter then with a `Predicate` that references the `nonNull` method of `Object`.

# Task

Use the `nonNull` predicate to filter the list in the `sumOfNonNullNumbers` method.

Note:
Method references can be used functionally, cool! So if I have a lamba-compatible interface (with one method), if the method happens to fit that interface we can refer to it with a method reference like: `this::instanceMethod` to refer to a method of an object or `Classnane::methodName` to refer to a static method.

So because `Objects::nonNull` has signature `public static boolean nonNull(Object obj)` it can be used as a `Predicate` because it takes an argument and returns Boolean. You could also use it as a Function<T, Boolean>.
