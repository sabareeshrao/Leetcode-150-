# LeetCode 150 + FAANG Interview Journey

## Current Progress

**Day 001 / 300**  
**Current level:** Beginner  
**Language:** Python  
**Explanation style:** Telugu in English font  
**Next planned day:** Day 002

Ee repository mana gradual LeetCode 150 + FAANG interview preparation journey ki progress record.

Mana main rule:

**tiny task -> tiny task -> pattern understanding -> LeetCode problem -> variation -> independent solve**

Prerequisites comfortable ga anipinche varaku direct ga LeetCode problem meeda jump cheyyamu.

---

# Day 001 - List ni Ardham Chesukundam

## Eeroju goal

Eeroju kevalam 3 concepts meeda focus chestham:

1. Python `list` ante multiple values ni oka place lo store cheyyadam.
2. `for` loop list lo unna values ni okkokati visit chestundi.
3. `if` statement tho oka condition ni check cheyyachu.

Eeroju direct LeetCode problem ledu.

Future lo **Two Sum** lanti problems solve cheyyadaniki kavalsina basic foundation ni ippudu build chestunnam.

---

## Day 1.1 - List ni chuddam

```python
numbers = [4, 7, 2, 9, 5]
```

Idi 5 boxes laga imagine cheyyi:

```text
Index:   0  1  2  3  4
Value:   4  7  2  9  5
```

Mini questions:

- First value enti?
- Index `3` lo unna value enti?
- Total enni values unnayi?

Code run cheyyakunda mundu mentally answer cheyyadaniki try cheyyi.

---

## Day 1.2 - Prathi value ni visit cheyyadam

Ee code chudu:

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

`for number in numbers` ante list lo unna prathi value okkokatiga `number` variable loki vastundi.

### Mini Task 1

List ni ila marchu:

```python
numbers = [10, 20, 30]
```

Program run cheyyakunda output enti ani mundu predict cheyyi.

Tarvata run chesi verify cheyyi.

---

## Day 1.3 - Condition check cheyyadam

```python
numbers = [4, 7, 2, 9, 5]

for number in numbers:
    if number > 5:
        print(number)
```

Ikkada Python prathi number ni chusi `5` kanna pedda number aa kaada ani check chestundi.

Run cheyyakunda mundu output predict cheyyi.

### Mini Task 2

Condition ni marchi `5` kanna chinna numbers matrame print cheyyi.

List ni matram marchakudadhu.

---

## Day 1.4 - Count cheyyadam

```python
numbers = [4, 7, 2, 9, 5]
count = 0

for number in numbers:
    if number > 5:
        count = count + 1

print(count)
```

`count = 0` tho start chestham.

Condition true aina prathi sari:

```python
count = count + 1
```

ante count ni 1 increase chestham.

### Mini Task 3

Code run cheyyakunda mundu cheppu:

```text
Final count entha untundi?
```

Tarvata run chesi check cheyyi.

### Mini Task 4

Program ni marchi `5` kanna chinna numbers enni unnayo count cheyyi.

---

## Day 1.5 - Oka number ni search cheyyadam

Ee starter code ni complete cheyyi:

```python
numbers = [4, 7, 2, 9, 5]
target = 9
found = False

for number in numbers:
    # Nee code ikkada

print(found)
```

Goal:

```text
9 list lo unte -> True
9 list lo lekapothe -> False
```

Adi working ayyaka:

```python
target = 100
```

ani marchi output mundu predict cheyyi.

---

## Day 1 Challenge

Ee list use cheyyi:

```python
numbers = [8, 3, 11, 4, 7]
```

`6` kanna pedda numbers enni unnayo count chese small program rayi.

Expected answer:

```text
3
```

Mundhu examples ni direct ga copy cheyyakunda own ga try cheyyi.

---

## Day 1 lo manam actual ga em nerchukuntunnam?

Interview problems lo chala sarlu basic flow ide:

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
SOME INFORMATION UPDATE CHEYYI
```

Later ide concept ila grow avutundi:

- searching
- counting
- maximum/minimum finding
- duplicate detection
- Two Sum
- sliding window
- hash map problems
- tree traversals
- graph traversals

---

## Day 1 Completion Check

Day 2 ki velladaniki mundu nee own words lo explain cheyyagalagali:

- list ante enti
- index ante enti
- `for` loop em chestundi
- `if` statement em chestundi
- matching values ni ela count chestham
- list ni scan chesi oka value ni ela search chestham

Ippude clever algorithms memorize cheyyalsina avasaram ledu.

---

## Progress Ledger

| Day | Topic | LeetCode Problem | Status |
|---|---|---|---|
| 001 | Lists, scanning, conditions, counting | None intentionally | STARTED |

## Daily Git Rule

Prathi learning day ki oka Git commit untundi. Future lo ee journey ni vere chat lo continue chesina, latest repository state ni inspect chesi highest completed/started day nundi continue cheyyali.
