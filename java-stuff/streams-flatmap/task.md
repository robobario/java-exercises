# Functional Java - Streams - Flatmap

flat map is a common functional operation.

When we talk about flattening it could be good to think of this example:

Take a list of lists:
```json
[["abc", "def"], ["ghi", "jkl"]]
```

flattened it would would be:
```json
["abc", "def", "ghi", "jkl"]
```

More generally each item in `[["abc", "def"], ["ghi", "jkl"]]` had some function applied to it which added some items to the flattened list. In this case the function just returned all the elements of the sublist.

So another example might be we have a bunch of mailboxes. We want to get all the letters from the mailboxes and send them.

So we could use a flatMap to go:

```java
mailboxes.stream().flatMap(box -> box.getLetters()).forEach(letter -> send(letter))
```

where `getLetters` returns a Stream<Letter>

# Task

Implement `sumAll`, using flatMap to flatten the input lists before summing all the elements.