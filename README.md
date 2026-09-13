# LeetCode 150 + FAANG Interview Journey

## Current Progress

**Day 002 / 300**  
**Current level:** Beginner  
**Language:** Java  
**Explanation style:** English only  
**Next planned day:** Day 003

This repository is the progress record for a gradual LeetCode 150 + FAANG interview preparation journey.

Learning rule:

**tiny task -> tiny task -> pattern understanding -> LeetCode problem -> variation -> independent solve**

We will not jump directly into a LeetCode problem until the required fundamentals feel comfortable.

---

# Day 001 - Scanning an Array

## Today's goal

Today focuses on 4 basic ideas:

1. Store multiple integer values in a Java `int[]` array.
2. Understand that array indexes start at `0`.
3. Use an enhanced `for` loop to visit values one by one.
4. Use an `if` condition to check values and update a result.

There is no direct LeetCode problem today. This is foundation work for problems such as **Two Sum** later.

## Day 1.1 - Array

```java
int[] numbers = {4, 7, 2, 9, 5};
```

```text
Index:  0  1  2  3  4
Value:  4  7  2  9  5
```

Mini questions:

- What is the first value?
- What value is at index `3`?
- How many total values are there?

## Day 1.2 - Visit every value

```java
int[] numbers = {4, 7, 2, 9, 5};

for (int number : numbers) {
    System.out.println(number);
}
```

### Mini Task 1

Change the array to `{10, 20, 30}` and predict the output before running it.

## Day 1.3 - Check a condition

```java
int[] numbers = {4, 7, 2, 9, 5};

for (int number : numbers) {
    if (number > 5) {
        System.out.println(number);
    }
}
```

### Mini Task 2

Print only the values smaller than `5`.

## Day 1.4 - Count while scanning

```java
int[] numbers = {4, 7, 2, 9, 5};
int count = 0;

for (int number : numbers) {
    if (number > 5) {
        count++;
    }
}

System.out.println(count);
```

### Mini Task 3

Predict the final value of `count` before running the code.

### Mini Task 4

Count how many numbers are smaller than `5`.

## Day 1.5 - Target search

```java
int[] numbers = {4, 7, 2, 9, 5};
int target = 9;
boolean found = false;

for (int number : numbers) {
    // Your code here
}

System.out.println(found);
```

Goal:

```text
If 9 exists     -> true
If 9 is missing -> false
```

## Day 1 Challenge

```java
int[] numbers = {8, 3, 11, 4, 7};
```

Count how many values are greater than `6`.

Expected answer:

```text
3
```

---

## Day 1 Solution

The complete Java solution is stored at:

`day-001/Day1Solution.java`

The solution covers:

- first value, index 3, and array length
- values smaller than 5
- count greater than 5
- count smaller than 5
- search for target 9
- Day 1 challenge

## Core pattern

```text
SCAN THE ARRAY
      |
      v
LOOK AT ONE VALUE
      |
      v
CHECK A CONDITION
      |
      v
UPDATE THE RESULT
```

This same idea will later appear in searching, counting, maximum/minimum problems, duplicate detection, Two Sum, sliding window, hash map problems, trees, and graphs.

## Progress Ledger

| Day | Topic | LeetCode Problem | Status |
|---|---|---|---|
| 001 | Java arrays, scanning, conditions, counting, search | None intentionally | COMPLETE |
| 002 | Index-based traversal, target index, break | None intentionally | COMPLETE |

## Day 2 Files

- Tasks: `day-002/Day2Tasks.md`
- Solution: `day-002/Day2Solution.java`

## Daily Git Rule

Each learning day is recorded in the repository. If this journey continues in another chat or branch, inspect the latest repository state and continue from the next unfinished day.
