# Lab 07 — Method Basics

| | |
|---|---|
| **Week** | 8 |
| **Textbook** | Liang — **Chapter 6** (Methods) |
| **Time budget** | 60 minutes |
| **Points** | 100 |

---

## Learning Objectives

1. Define a `static` method with parameters and a return type.
2. Return a value rather than printing it, and explain why that separation matters.
3. Choose a return type that cannot silently lose information (`long` versus `int`).
4. Return a sentinel value to signal an invalid argument.
5. Recognise that the test driver calls your methods directly, so signatures are contractual.

---

## Background

From this lab onward, **the test driver calls your methods by name**. If you rename a method,
change a parameter list, or change a return type, the lab will not compile and the grade is zero
for correctness. Treat the given signatures as a published interface.

**Anatomy of a method:**

```java
public static double celsiusToFahrenheit(double celsius) {
//     |      |            |                    |
//     |      |            |                    +-- parameter: the input, named locally
//     |      |            +-- method name: a verb phrase describing what it produces
//     |      +-- return type: the kind of value handed back to the caller
//     +-- static: belongs to the class, so no object is needed to call it
    return (9.0 / 5) * celsius + 32;   // return hands the value back and ends the method
}
```

**Return, do not print.** A method that prints its answer can be used in exactly one way. A method
that returns its answer can be printed, stored, compared, or passed to another method. The test
driver checks returned values; a method that prints and returns `0` fails every check.

**Integer division inside a formula.** `9 / 5` is `1`, so `celsiusToFahrenheit` must be written
with `9.0 / 5`. The test driver checks 37 °C, where the wrong version reports 69.0 instead of 98.6.

**Overflow.** `13!` is 6,227,020,800, which exceeds the `int` maximum of about 2.1 billion. The
declared return type is `long` for exactly this reason. An `int` accumulator inside the method
would still overflow — the accumulator must also be `long`.

---

## Instructions

Implement the six methods. Each already exists with a placeholder `return` so the file compiles
before you begin; replace each placeholder.

| Step | Method | Requirement |
|---|---|---|
| 1 | `celsiusToFahrenheit(double)` | `(9.0 / 5) * celsius + 32` |
| 2 | `isEven(int)` | Return the boolean expression itself — no `if` statement |
| 3 | `max3(int, int, int)` | Largest of three; `Math.max` twice is acceptable |
| 4 | `factorial(int)` | `0!` is 1; return `-1` for negative input; use a `long` accumulator |
| 5 | `bmi(double, double)` | `weight / (height * height)`; return `-1.0` when height ≤ 0 |
| 6 | `totalWithTax(double, double)` | `subtotal * (1 + taxRate)` |
| 7 | `main` | Call each method once and print a labelled result |

**On Step 2:** `return number % 2 == 0;` is complete and correct. Writing
`if (number % 2 == 0) return true; else return false;` produces the right answer but costs style
points, because the comparison already *is* a boolean.

---

## Commenting Standard (20 points)

```java
// WEAK
return (9.0 / 5) * celsius + 32; // convert

// STRONG
// 9.0 forces floating-point division; the literal 9 would make 9 / 5 evaluate
// to the int 1 and every conversion would be wrong by a constant factor.
return (9.0 / 5) * celsius + 32;
```

---

## Compile, Run, and Test

```bash

```

---

## Expected Test Output

```
--- celsiusToFahrenheit ---
  [PASS] 0 C = 32 F
  [PASS] 100 C = 212 F
  [PASS] -40 C = -40 F
  [PASS] 37 C = 98.6 F (integer division would give 69.0)
...
RESULT: 24 of 24 checks passed.
```

---

## Grading Rubric

| Criterion | Points |
|---|---|
| All 24 checks pass | 60 |
| Line comments explain every statement | 20 |
| Methods return rather than print; boundary cases handled cleanly | 10 |
| Committed and pushed on time | 10 |

---

## Submission Checklist

- [ ] `bash tools/run_lab.sh lab07` reports 24 of 24.
- [ ] No method signature was altered.
- [ ] `main` demonstrates every method with a labelled printout.

```bash
git add . && git commit -m "Lab 07 complete - all 24 checks passing" && git push
```

---

## Stretch Goal

Add `public static String bmiCategory(double bmi)` returning `Underweight`, `Normal`,
`Overweight`, or `Obese` at the standard cutoffs of 18.5, 25, and 30, then call it from `main`
using the value returned by `bmi`. This is method composition: one method consuming another's result.

---

## Troubleshooting

| Symptom | Cause | Fix |
|---|---|---|
| `cannot find symbol: method ...` | A signature was renamed | Restore the exact signature |
| `missing return statement` | A path through the method returns nothing | Every branch must return |
| `37 C` gives 69.0 | Wrote `9 / 5` | Write `9.0 / 5` |
| `13!` is negative or wrong | `int` accumulator overflowed | Declare the accumulator `long` |
| All checks fail but the program prints correct values | Methods print instead of returning | Use `return` |

