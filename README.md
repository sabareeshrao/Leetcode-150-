# LeetCode 150 + FAANG Interview Journey

## Current Progress

**Day 001 / 300**  
**Current level:** Beginner  
**Language:** Python  
**Next planned day:** Day 002

This repository is the progress record for a gradual LeetCode 150 and FAANG interview-preparation journey.

The rule is simple:

**tiny task -> tiny task -> pattern understanding -> LeetCode problem -> variation -> independent solve**

We will not jump directly into a LeetCode problem before its prerequisites feel comfortable.

---

# Day 001 - Meet the List

## Today's goal

Understand three ideas only:

1. A Python list can hold multiple values.
2. A `for` loop can visit those values one at a time.
3. An `if` statement can check a condition while we scan the list.

No LeetCode problem today.

Our long-term destination from these fundamentals includes problems such as **Two Sum**, but today we only build the foundation.

---

## Day 1.1 - Read a list

```python
numbers = [4, 7, 2, 9, 5]
```

Think of it as five boxes:

```text
Index:   0  1  2  3  4
Value:   4  7  2  9  5
```

Mini questions:

- What is the first value?
- What is the value at index `3`?
- How many values are in the list?

Do these mentally first.

---

## Day 1.2 - Visit every value

Run this code:

```python
numbers = [4, 7, 2, 9, 5]

for number in numbers:
    print(number)
```

Expected output:

```text
4
7
2
9
5
```

### Mini Task 1

Change the list to:

```python
numbers = [10, 20, 30]
```

Without running the program first, predict the output.

Then run it and check yourself.

---

## Day 1.3 - Check each value

Study this:

```python
numbers = [4, 7, 2, 9, 5]

for number in numbers:
    if number > 5:
        print(number)
```

Before running it, predict what will be printed.

### Mini Task 2

Modify the condition so that it prints only numbers smaller than `5`.

Do not change the list.

---

## Day 1.4 - Count while scanning

Starter code:

```python
numbers = [4, 7, 2, 9, 5]
count = 0

for number in numbers:
    if number > 5:
        count = count + 1

print(count)
```

### Mini Task 3

Before running it, answer:

```text
What should count contain at the end?
```

Then run it.

### Mini Task 4

Change the program so it counts numbers smaller than `5` instead.

---

## Day 1.5 - Search for one number

Complete this yourself:

```python
numbers = [4, 7, 2, 9, 5]
target = 9
found = False

for number in numbers:
    # Your code here

print(found)
```

Goal:

```text
If 9 exists in the list -> True
If 9 does not exist -> False
```

After you get it working, change:

```python
target = 100
```

and predict the result before running it.

---

## Day 1 Challenge

Use this list:

```python
numbers = [8, 3, 11, 4, 7]
```

Write a small program that counts how many numbers are greater than `6`.

Expected answer:

```text
3
```

Try to write it without copying the earlier program.

---

## What Day 1 is secretly teaching

Today is already building the basic operation used in hundreds of interview problems:

```text
SCAN AN ARRAY
      |
      v
LOOK AT ONE VALUE
      |
      v
CHECK A CONDITION
      |
      v
UPDATE SOME INFORMATION
```

Later this same idea becomes:

- searching
- counting
- finding maximum/minimum
- duplicate detection
- Two Sum
- sliding window
- hash-map problems
- many tree and graph traversals

---

## Day 1 Completion Check

Before moving to Day 2, you should be able to explain in your own words:

- what a list is
- what an index is
- what a `for` loop does
- what an `if` statement does
- how to count matching values
- how to search for a value by scanning the list

You do **not** need to memorize clever algorithms yet.

---

## Progress Ledger

| Day | Topic | LeetCode Problem | Status |
|---|---|---|---|
| 001 | Lists, scanning, conditions, counting | None intentionally | STARTED |

## Daily Git Rule

Each learning day gets its own Git commit. Future days should inspect the latest repository state and continue from the highest completed/started day rather than restarting the syllabus.
