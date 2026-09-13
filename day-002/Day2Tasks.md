# Day 002 / 300 - Index-Based Array Traversal

**Language:** Java  
**Level:** Beginner  
**Status:** STARTED  
**LeetCode problem today:** None intentionally

## Day 2.1 - Predict the indexes

```java
int[] numbers = {4, 7, 2, 9, 5};

for (int i = 0; i < numbers.length; i++) {
    System.out.println(i);
}
```

### Question 1

Before running the code, write the exact output.

### Question 2

What does `i` represent in this loop?

---

## Day 2.2 - Print index and value

Use:

```java
int[] numbers = {4, 7, 2, 9, 5};
```

### Question 3

Write one loop that prints:

```text
Index 0 -> 4
Index 1 -> 7
Index 2 -> 2
Index 3 -> 9
Index 4 -> 5
```

Rules:

- use a normal `for` loop
- use `numbers[i]`
- do not write five separate print statements

---

## Day 2.3 - Find the index of a target

Complete this code:

```java
int[] numbers = {4, 7, 2, 9, 5};
int target = 9;
int targetIndex = -1;

for (int i = 0; i < numbers.length; i++) {
    // Your code here
}

System.out.println(targetIndex);
```

### Question 4

Write the missing code so the program stores the index of `9` in `targetIndex`.

---

## Day 2.4 - Missing target

Change only:

```java
int target = 100;
```

### Question 5

Without running the program first, what will `targetIndex` contain at the end?

---

## Day 2.5 - Stop after finding the target

Use `target = 9` again.

### Question 6

Modify your solution so the loop stops immediately after finding the target.

Use:

```java
break;
```

### Question 7

In one sentence, what does `break` do in your program?

---

# Day 2 Challenge

Use:

```java
int[] numbers = {8, 3, 11, 4, 7};
int target = 11;
```

### Question 8

Write a complete Java program that finds the index of `11`.

Rules:

- use a normal index-based `for` loop
- use `numbers[i]`
- start the answer variable at `-1`
- use `break` after finding the target
- do not use a built-in search method

Do not check the solution yet. Try all questions first.
