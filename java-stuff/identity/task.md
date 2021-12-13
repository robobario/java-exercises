# Reference equality vs Object::equals

When comparing objects for equality you have a couple of options:

## Reference Equality

When you use the `==` operator to compare objects (as opposed to primitive types) [it returns](https://docs.oracle.com/javase/specs/jls/se13/html/jls-15.html#jls-15.21.3): 
> At run time, the result of == is true if the operand values are both null or both refer to the same object or array; otherwise, the result is false.

So if you used it like `new Thing() == new Thing()` it would return false.

## Object::equals (and it's friend hashcode)

The other common equality check is [Object::equals](https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html#equals(java.lang.Object)). With signature `public boolean equals(Object obj)`. It is used for logical equality. `a` and `b` may be different objects on the heap, but their equals methods could be implemented such that `a.equals(b)` is true.

The default implementation of equals is reference equality, so we need to `override` the equals method to get different behaviour.

When you override equals you must implement hashcode too:
> Note that it is generally necessary to override the hashCode method whenever this method is overridden, so as to maintain the general contract for the hashCode method, which states that equal objects must have equal hash codes.

This is because `hashCode` and `equals` are used together by other classes like HashMap and if you break the contract then HashMap and any other util built on this contract will not work as desired.

# Task

Override the equals and hashcode of the `Jar` class so that `new Jar("marmite").equals(new Jar("marmite"))` is true.