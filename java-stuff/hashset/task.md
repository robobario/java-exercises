# Hashset

A useful collection is HashSet. This is an implementation of the [Set](https://docs.oracle.com/javase/7/docs/api/java/util/Set.html) interface, which is described in the javadocs as:

> A collection that contains no duplicate elements. More formally, sets contain no pair of elements e1 and e2 such that e1.equals(e2), and at most one null element. As implied by its name, this interface models the mathematical set abstraction.

This has many nice properties. To find distinct values converting a collection to a HashSet is often nice.

# Task

Update Container so that `setOfUniqueValues` returns only distinct elements, using a Hashset. You could either change the type of `set`, or make the `setOfUniqueValues` construct a new hashset and add all the elements of `set` to it.