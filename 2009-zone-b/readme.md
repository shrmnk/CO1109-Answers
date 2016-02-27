# 2009 Zone B Answers

---

## Question 1

* a) i) 6
* a) ii) 3
* a) iii) 5
* a) iv) 2
* a) v) 2000
* a) vi) Infinity
* a) vii) 0
* a) viii) 0
* a) ix) Infinity

---

* b) i) 64ms
  (This linear function is of order `O(n)`. However, since every result has an equal probability of happening, the average search time would be `n/2`. The worst-case time complexity, however, is `n`. )
* b) ii) 7ms
  (This function is of order `O(log(n))`, but the worst-case time complexity is calculated by `log(n) + 1`)
* b) iii) Makes `t` and `temp` have the same value, with its memory address referred to by `a[x]` and `a[y]`
* b) iv) Checks if the integer value `thing` is found within the given array `a[]`

---

* c) i) Vector can grow dynamically in size while array is fixed and cannot be changed
* c) ii)
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

## Question 2

* a) i) hello
* a) ii) goodbye
* a) iii) `true`

---

* b) i) Outputs the contents of the given file specified in the command line.

* b) ii) Copies the given file specified in the first command line argument and places the content into the file specified in the second command line argument.
    1. It takes the first command-line argument as the filename
    2. Opens the file using `FileReader`
    3. Reads the file character-by-character
    4. Prints out the read character
    5. Repeats steps 3 and 4 until it hits the end of the file indicated by the character being -1

---

* c) i) An exception will be thrown for the argument given in `Integer.parseInt();`, as it is not a valid numerical string.

* c) ii)
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

## Question 3

* a) i) 1
* a) ii) 22. 1.5
* a) iii) 23. 6

---

* b) i) D
* b) ii) -2147483648
* b) iii) Run out of memory
* b) iv) 65535

---

* c) i) 5
* c) ii) 5
* c) iii) hello
* c) iv) 5

---

## Question 4

* a) i) s
* a) ii) hello hello
* a) iii) `Exception: Divide by Zero (ArithmeticException)`

---

* b) i) 3
* b) ii) `Date dob = new Date(10, 4, 1992);`
* b) iii) 2
* b) iv)
```java
Date dob = new Date(10, 4, 1992);
Person mary = new Person("Mary", "Smith", dob, true);
```

---
* c)
```java
public class Person_Ext extends Person {
    public String middleName;

    public Person(String m, String f, String l, Date birth, boolean s) {
        middleName = m;
        super(f, l, birth, s);
    }
}
```

---

###### Contributors
> These people helped to make the above answers: [@hong-yi](https://github.com/hong-yi) [@shrmnk](https://github.com/shrmnk)
