# Day 002 / 300 - Index-Based Array Traversal

**Language:** Java  
**Level:** Beginner  
**Status:** STARTED  
**LeetCode problem today:** None intentionally

## Why Day 2 exists

On Day 1, you learned how to scan array values.

Today you learn how to scan an array while also knowing **where each value is located**.

This matters because many LeetCode problems eventually ask you to return an **index**, not just a value. Two Sum is one important example later.

Do not use `Arrays.asList()`, streams, or built-in search helpers today. The goal is to understand the loop yourself.

---

## Day 2.1 - Understand the normal `for` loop

Start with:

```java
int[] numbers = {4, 7, 2, 9, 5};

for (int i = 0; i < numbers.length; i++) {
    System.out.println(i);
}
```

### Mini Task 1

Before running the code, predict exactly what it prints.

Then run it and verify your prediction.

Question to answer in your own words:

```text
What does i represent?
```

---

## Day 2.2 - Use an index to access a value

Study this line:

```java
numbers[i]
```

It means:

```text
Give me the value stored at index i.
```

### Mini Task 2

Using the same array, write a loop that prints this:

```text
Index 0 -> 4
Index 1 -> 7
Index 2 -> 2
Index 3 -> 9
Index 4 -> 5
```

Do not write five separate `System.out.println()` statements.

Use one loop.

---

## Day 2.3 - Search and remember the index

Use this starter code:

```java
int[] numbers = {4, 7, 2, 9, 5};
int target = 9;
int targetIndex = -1;

for (int i = 0; i < numbers.length; i++) {
    // Your code here
}

System.out.println(targetIndex);
```

### Mini Task 3

Complete the loop so that `targetIndex` becomes the index where `9` is found.

Expected output:

```text
3
```

Important idea:

```text
-1 = not found yet
```

Do not worry about whether `-1` is the only possible design. We are using it because it makes the idea easy to see.

---

## Day 2.4 - Test the missing case

Change only:

```java
int target = 100;
```

### Mini Task 4

Before running the code, predict the final value of `targetIndex`.

Then run it.

You should understand why the result stays unchanged when no match is found.

---

## Day 2.5 - Stop after finding the target

Return to:

```java
int target = 9;
```

### Mini Task 5

After finding the target and storing its index, add:

```java
break;
```

Then explain in one sentence what `break` does here.

---

# Day 2 Challenge

Use:

```java
int[] numbers = {8, 3, 11, 4, 7};
int target = 11;
```

Write a program that finds the index of `11`.

Expected output:

```text
2
```

Rules:

- use a normal index-based `for` loop
- use `numbers[i]`
- start the answer variable at `-1`
- use `break` after finding the target
- do not use a built-in search method

---

## What Day 2 is teaching

```text
INDEX i
   |
   v
numbers[i]
   |
   v
CHECK THE VALUE
   |
   v
REMEMBER THE INDEX
```

Day 1 taught:

```text
What is the value?
```

Day 2 adds:

```text
Where is the value?
```

That distinction will become important when we eventually reach problems that return positions, especially Two Sum.

## Day 2 Completion Check

Before asking for the Day 2 solution, you should be able to explain:

- why Java arrays start at index `0`
- what `i` means in `for (int i = 0; i < numbers.length; i++)`
- what `numbers[i]` means
- why `targetIndex` starts at `-1`
- how to store an index when a value is found
- what `break` does

Do not move to nested loops yet. That comes after this index idea feels comfortable.
