# 2009 Zone B Answers

---

1. Question 1

    1. [ 9 Marks ]

        1. 6

        2. 3

        3. 5

        4. 2

        5. 2000

        6. Infinity

        7. 0

        8. 0

        9. Infinity

    2. [ 8 Marks ]

        10. 128ms (bigO is n)

        11. 7ms (bigO is log(n))

        12. Makes `t` and `temp` have the same value, with its memory address referred to by `a[x]` and `a[y]`

        13. Checks if the integer value `thing` is found within the given array `a[]`

    3. [8 Marks]

        14. Vector can grow dynamically in size while array is fixed and cannot be changed
```java
public static String shortestString(Vector<String> vecString) {
    String shortest = "";
    if (vecString.size() > 0) {
        shortest = vecString.elementAt(0);
        for (int i =0; i < vecString.size(); i++) {
            if(shortest.length() > vecString.elementAt(i).length()) {
              shortest = vecString.elementAt(i);
        }
    }
}
```

---

2. Question 2

    4. [ 9 Marks ]

        15. hello

        16. goodbye

        17. `true`

    5. [ 8 Marks ]

        18. Outputs the contents of the given file specified in the command line.

            1. It takes the first command-line argument as the filename

            2. Opens the file using `FileReader`

            3. Reads the file character-by-character

            4. Prints out the read character

            5. Repeats steps 3 and 4 until it hits the end of the file indicated by the character being -1

        19. Copies the given file specified in the first command line argument and places the content into the file specified in the second command line argument.

    6. [ 8 Marks ]

        20. An exception will be thrown for the argument given in `Integer.parseInt();`, as it is not a valid numerical string.

```java
public static boolean checkInt(String a) {
  try {
    Integer.parseInt(a);
  } catch (Exception e) {
    return false;
  }
  return true;
}
```

---

3. Question 3

    7. [ 9 Marks ]

        21. 1

        22. 1.5

        23. 6

    8. [ 8 Marks ]

        24. D

        25. -2147483648

        26. Run out of memory

        27. 65535

    9. [ 8 Marks ]

        28. 5

        29. 5

        30. hello

        31. 5


---

4. Question 4

    10. [ 9 Marks ]

        32. s

        33. hello hello

        34. `Exception: Divide by Zero (ArithmeticException)`

    11. [ 8 Marks ]

        35. 3

```java
Date dob = new Date(10, 4, 1992);
```


        36. 2

```java
Date dob = new Date(10, 4, 1992);
Person mary = new Person("Mary", "Smith", dob, true);
```


    12. [ 8 Marks ] (Not taught yet)

```java
public class Person_Ext extends Person {
    public String middleName;

    public Person(String m, String f, String l, Date birth, boolean s) {
        middleName = m;
        super(f, l, birth, s);
    }
}
```
