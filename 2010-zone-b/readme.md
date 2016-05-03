# 2010 Exam Paper

| **DISCLAIMER**  |
| :---: |
| This repository of documents and source codes were created with the intention of helping fellow students. No infringement of copyrights or legal rights intended. |
| Please only take these answers as a *reference* for your research purposes. |

---

## Question 01

#### Part A

* (i) `zbbcccdddd`
* (ii) ASCII value of `z` = `122`
* (iii) `z`

#### Part B

* (i) Counts the number of characters inside the file.
* (ii) Counts the number of characters that are not new lines, blank spaces or indentations.

```java
//(iii)
public static void main(String[] args) throws Exception {
    FileReader f = new FileReader("xxx");
    int x = 0;
    Scanner s = new Scanner(f);
    while (s.hasNextLine()) {
        x++;
        s.nextLine();
    }
    System.out.println(x);
}
```
#### Part C

```java
public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
```

---

## Question 02

#### Part A

* (i) There is no constructor or any constructor that takes in any arguments.
* (ii) `fred mark: 24% 26 years old`

#### Part B

* (i) There is no method name called `age()`.
* (ii) Every class implicitly imports the `java.lang.Object` and  contains the `toString()` method, therefore the program compiles.

#### Part C

```java
class StudentWithGender extends Student {
    boolean gender;

    public StudentWithGender(String na, int ag, int mar, boolean gen) {
        super(na, ag, mar);
        gen = gender;
    }
}
```

---

## Question 03

#### Part A
* (i) `java.util.Scanner s = new java.util.Scanner(System.in);`
* (ii) `three`
* (iii) `ArrayIndexOutOfBoundsException`

#### Part B
* (i) The method requires an argument but no argument was passed in.
* (ii) The method will not return anything and therefore cannot print any value.
* (iii) Variable `y` is supposed to take in a `String` but an `int` was assigned to it and it is incompatible.
* (iv) An `array` length is a property instead of a method to call.

#### Part C

`1000`

---

## Question 04

#### Part A
* (i) `true`
* (ii) `false`
* (iii) `0`

#### Part B
* (i) `27`
* (ii) `27`
* (iii) `81`

#### Part C
`goodbyegoodbye`

---

###### Contributors
> These people helped to make the above answers: @hong-yi
