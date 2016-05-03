# 2015 Zone A Exam Paper

| **DISCLAIMER**  |
| :---: |
| This repository of documents and source codes were created with the intention of helping fellow students. No infringement of copyrights or legal rights intended. |
| Please only take these answers as a *reference* for your research purposes. |

---

## Question 01

#### Part A 
* (i) 50
* (ii) 10
* (iii) 125
* (iv) 38
* (v) 3

#### Part B
* (i) No
* (ii) Yes
* (iii) Yes
* (iv) Yes
* (v) No
* (vi) Yes
* (vii) Yes
* (viii) Yes
* (ix) Yes
* (x) Yes

#### Part C
* (i) Method overloading

* (ii) `Integer.parseInt()` can take in 1 or 2 values. If passed in 1 value, it will attempt to parse the value as an Integer, else if passed in 2 values, it will attempt to parse the first value using the second value as its radix.

* (iii) 
```java
public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(Math.max(("morning" + "dog").length(), 5));
        // System.out.println("boy".compareTo(6));
        Scanner in = new Scanner(System.in);
        int firstVal = in.nextInt();
        int secondVal = in.nextInt();
        int thirdVal = in.nextInt();

        //compare between each 
        int min12 = Math.min(firstVal, secondVal);
        int min23 = Math.min(secondVal, thirdVal);
        int max12 = Math.max(firstVal, secondVal);
        int max23 = Math.max(secondVal, thirdVal);
        int result1 = Math.min(min12, min23); // smallest of them all.
        int result2 = Math.min(max12, max23); // smallest of the two largest
        int result3 = Math.max(max12, max23); // largest of them all.

        System.out.println(result1 + " " + result2 + " " + result3);


    }
```

## Question 02 

#### Part A

* (i)
```java
0
1
2
3
4
```

* (ii) `ArrayIndexOutOfBoundsException` will be thrown.


#### Part B

The program will crash when the user enters more than 1000 inputs without terminating the program which will throw an `IndexOutOfBoundsException` as the array can only accept 1000 inputs.

#### Part C
```java
int longestLength(String[] arr) {
	int longest = arr[0].length();
	if (arr.length == 0) return 0;
	for (int i = 0; i < arr.length(); i++) {
		if (arr[i].length() > longest) {
			longest = arr[i].length();
		}
	}
	return longest;
}
```

## Question 03

#### Part A
```java
***
***
***
```

#### Part B
```java
import java.util.Scanner;

class F
{
	 Scanner in = new Scanner(System.in);
        System.out.print("Enter width>");
        int height = in.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = height; k > i; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
```

## Question 4

#### Part A

```java
boolean isEven(int num) {
	return num % 2 == 0;
}
```

#### Part B

```java
static void syracruse(int a) {
        System.out.print(a + " ");
        if (a == 1) return;
        if (a % 2 == 0) {
           syracruse(a/2);
        }
        else syracruse(3 * a + 1);
        
    }
```

#### Part C

```java
    int multiply(int a, int b) {
        if (b == 0 || a == 0) {
            return 0;
        }
        else if (b < 0) {
            return - a + multiply(a, b + 1);
        }
        else {
            return a + multiply(a, b - 1);
        }
    }
```

## Question 05

#### Part A 

* (i) It will print out the contents of `filey.java`
* (ii) It will get the value `-1` when it reaches the end of file.
* (iii) There will be nothing printed out as there are no exceptions thrown and the first character found by the program will be an end of file character.

#### Part B

`"morning".charAt(0) = 'm'`

#### Part C

`s.charAt(s.length() -1);`


#### Part D 

```java
 public static void main(String[] args) {

    // TODO code application logic here
    //System.out.println(Math.max(("morning" + "dog").length(), 5));
    // System.out.println("boy".compareTo(6));
    try {
        FileReader fr = new FileReader(new File("hello"));
        int t = fr.read();
        while (t != -1) {

            if ((char) t == 'c') {
                t = 'd';
            } else if ((char) t == 'd') {
                t = 'c';
            }

            System.out.print((char) t);
            t = fr.read();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
```

## Question 06

#### Part A 

It will print `gamma`.

#### Part B

`Person.java`
```java
public class Person {
    String firstName;
    String lastName;
    Date dob;
    
    public Person(String firstName, String lastName, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }
}
```

`Date.java`
```java
public class Date {
    int day;
    int month;
    int year;
    
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}
```
#### Part C
```java
public class boygirl extends Person {
    boolean gender;
    String firstname;
    String lastName;
    Date dob;
    
    public boygirl(String firstName, String lastName, Date dob, boolean gender) {
        super(firstName, lastName, dob);
        this.gender = gender;
    }
}
```

#### Part D
```java
public class Dice {

    static int roll() {
        java.util.Random r = new java.util.Random();
        return r.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        int consecutiveSixes = 0, count = 0;
        while (consecutiveSixes < 3) {
            if (roll() == 5) {
                consecutiveSixes++;
            } else {
                consecutiveSixes = 0;
            }
            count++;
        }
        System.out.println(count);
    }

}
```