# ArrayList

A common collection you will use often is the ArrayList. This is part of the `java.util.Collection` family of classes.

The collections framework is described [here](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/doc-files/coll-overview.html)

Copied from the docs:

The primary advantages of a collections framework are that it:

* Reduces programming effort by providing data structures and algorithms so you don't have to write them yourself.
* Increases performance by providing high-performance implementations of data structures and algorithms. Because the various implementations of each interface are interchangeable, programs can be tuned by switching implementations.
* Provides interoperability between unrelated APIs by establishing a common language to pass collections back and forth.
* Reduces the effort required to learn APIs by requiring you to learn multiple ad hoc collection APIs.
* Reduces the effort required to design and implement APIs by not requiring you to produce ad hoc collections APIs.
* Fosters software reuse by providing a standard interface for collections and algorithms with which to manipulate them.

Perhaps the most relevant one for us is interoperability. Third-party libraries can code their interfaces against classes like `Collection` or `Iterable` and then client code can pass in whatever implementation they want.

If a method takes a `String[]` but I currently have a HashSet of strings, then I must convert to array. But if the method takes a `Collection<String>` I can just hand it the hashset.

# Task

Implement `sum` again. It will look very similar to the array iteration like:
```java
for (Integer integer : list) {
    ...
}
```

note: after you have it working, you should be able to change `ArrayList` to `LinkedList` or `HashSet` and see that you do not need to change the `sum` method, it works against arbitrary implementors of `Collection`.