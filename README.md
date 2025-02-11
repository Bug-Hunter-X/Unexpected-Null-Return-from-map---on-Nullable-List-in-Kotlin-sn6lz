# Kotlin Nullable List and map() Function

This repository demonstrates an uncommon issue related to Kotlin's `map()` function when applied to nullable lists.  The `map()` function, when used with a nullable list and the safe call operator (`?.`), returns `null` if the list is `null`, instead of an empty list.  This behavior can be unexpected and lead to null pointer exceptions if not handled correctly.

The `bug.kt` file contains code that showcases this issue.  The `bugSolution.kt` file provides a solution using the `orEmpty()` function to handle this scenario gracefully.

## How to reproduce

1. Clone the repository.
2. Open `bug.kt` in a Kotlin IDE.
3. Run the code.
4. Observe the unexpected `null` output when the list is nullable and null.

## Solution

Refer to `bugSolution.kt` for a simple solution using the `orEmpty()` function which returns an empty list when the list is null preventing any unexpected `NullPointerExceptions`. 