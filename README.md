



# Inverted Pyramid Star Pattern Program

## Overview
This Java program generates an **Inverted Pyramid Star Pattern** based on the size entered by the user. The output resembles a pyramid flipped upside down, where each row contains decreasing stars centered in the middle. This program is useful for understanding **nested loops**, **space management in patterns**, and basic **logic building** in Java.

---

## Code Explanation

### Package Declaration
```java
package star_patterns;
```
- Declares that this file is part of the `star_patterns` package, useful for organizing multiple pattern programs.

---

### Import Statement
```java
import java.util.Scanner;
```
- Imports the `Scanner` class to read user input.

---

### Class Declaration
```java
public class InvertedPyramidStars
```
- Declares the class `InvertedPyramidStars` that contains the main logic.

---

### Main Method
```java
public static void main(String[] args)
```
- Entry point of the program.

---

### Scanner Initialization
```java
Scanner s = new Scanner(System.in);
```
- Creates a `Scanner` object to read the size from the user.

---

### Taking Input
```java
System.out.println("Enter the Size");
int size = s.nextInt();
```
- Prompts user for input and reads the size of the pyramid.

---

## Loop Breakdown

### Outer Loop - Rows
```java
for (int i = 1; i <= size; i++)
```
- This loop controls the **rows** in the pattern.

---

### Inner Loop 1 - Leading Spaces
```java
for (int j = 2; j <= i; j++)
```
- Adds leading spaces to shift stars to the right.

---

### Inner Loop 2 - Left Side Stars
```java
for (int j = i; j < size; j++)
```
- Prints stars for the **left half**.

---

### Inner Loop 3 - Right Side Stars
```java
for (int j = i; j <= size; j++)
```
- Prints stars for the **right half**.

---

### New Line After Each Row
```java
System.out.println();
```
- Moves to the next line after completing each row.

---

## Complete Code

```java
package star_patterns;

import java.util.Scanner;

public class InvertedPyramidStars
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Size");
        int size = s.nextInt();
        for (int i = 1; i <= size; i++)
        {
            for (int j = 2; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int j = i; j < size; j++)
            {
                System.out.print("*");
            }
            for (int j = i; j <= size; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

---

## Sample Output
```
Enter the Size
5
*********
 *******
  *****
   ***
    *
```

---

## Explanation Summary Table

| Variable | Type | Purpose |
|---|---|---|
| `s` | Scanner | Reads user input |
| `size` | int | Total number of rows (height) |
| `i` | int | Current row number |
| `j` | int | Controls spaces and stars in each row |

---

## Pattern Logic Breakdown

| Row Number (i) | Leading Spaces | Total Stars |
|---|---|---|
| 1 | 0 | 9 |
| 2 | 1 | 7 |
| 3 | 2 | 5 |
| 4 | 3 | 3 |
| 5 | 4 | 1 |

---

## Concepts Covered
✅ Loops (for loops)  
✅ Nested Loops  
✅ Conditional Printing (spaces & stars)  
✅ User Input Handling (`Scanner`)  
✅ Basic Pattern Logic  

---

## Clone
```
git clone https://github.com/Ananthadatta02/Java-Inverted_Pyramid_Patterns.git
```
