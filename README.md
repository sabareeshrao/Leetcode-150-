# LeetCode 150 + FAANG Interview Journey

## Current Progress

**Day 001 / 300**  
**Current level:** Beginner  
**Language:** Java  
**Explanation style:** Telugu in English font  
**Next planned day:** Day 002

Ee repository mana gradual LeetCode 150 + FAANG interview preparation journey ki progress record.

Mana learning rule:

**tiny task -> tiny task -> pattern understanding -> LeetCode problem -> variation -> independent solve**

Prerequisites comfortable ga anipinche varaku direct ga LeetCode problem meeda jump cheyyamu.

---

# Day 001 - Array ni Scan Cheyyadam

## Eeroju goal

Eeroju 4 basic ideas matrame:

1. Java `int[]` lo multiple integer values store cheyyadam.
2. Array index `0` nundi start avutundi.
3. Enhanced `for` loop tho values ni okkokati visit cheyyadam.
4. `if` condition tho values ni check chesi result ni update cheyyadam.

Eeroju direct LeetCode problem ledu. Idi later **Two Sum** lanti problems ki foundation.

## Day 1.1 - Array

```java
int[] numbers = {4, 7, 2, 9, 5};
```

```text
Index:  0  1  2  3  4
Value:  4  7  2  9  5
```

Mini questions:

- First value enti?
- Index `3` lo value enti?
- Total values enni?

## Day 1.2 - Prathi value ni visit cheyyadam

```java
int[] numbers = {4, 7, 2, 9, 5};

for (int number : numbers) {
    System.out.println(number);
}
```

### Mini Task 1

Array ni `{10, 20, 30}` ga marchi output ni mundu predict cheyyi.

## Day 1.3 - Condition check

```java
int[] numbers = {4, 7, 2, 9, 5};

for (int number : numbers) {
    if (number > 5) {
        System.out.println(number);
    }
}
```

### Mini Task 2

`5` kanna chinna values matrame print cheyyi.

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

Final `count` entha untundo run cheyyakunda predict cheyyi.

### Mini Task 4

`5` kanna chinna numbers enni unnayo count cheyyi.

## Day 1.5 - Target search

```java
int[] numbers = {4, 7, 2, 9, 5};
int target = 9;
boolean found = false;

for (int number : numbers) {
    // Nee code ikkada
}

System.out.println(found);
```

Goal:

```text
9 unte     -> true
9 lekapothe -> false
```

## Day 1 Challenge

```java
int[] numbers = {8, 3, 11, 4, 7};
```

`6` kanna pedda values enni unnayo count cheyyi.

Expected answer:

```text
3
```

---

## Day 1 Solution

Complete Java solution repository lo:

`day-001/Day1Solution.java`

Solution covers:

- first value, index 3, array length
- values smaller than 5
- count greater than 5
- count smaller than 5
- search for target 9
- Day 1 challenge

## Core pattern

```text
ARRAY NI SCAN CHEYYI
        |
        v
OKA VALUE NI CHUDU
        |
        v
CONDITION CHECK CHEYYI
        |
        v
RESULT UPDATE CHEYYI
```

Later ide searching, counting, maximum/minimum, duplicates, Two Sum, sliding window, hash map, trees and graphs lo malli malli vastundi.

## Progress Ledger

| Day | Topic | LeetCode Problem | Status |
|---|---|---|---|
| 001 | Java arrays, scanning, conditions, counting, search | None intentionally | COMPLETE |

## Daily Git Rule

Prathi learning day repo lo record avutundi. Future chat/branch lo continue chesina latest repository state ni inspect chesi next unfinished day nundi continue cheyyali.
