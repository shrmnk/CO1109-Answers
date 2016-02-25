# 2015 Zone B Answers
---

## Question 1

* a) i) 65
* a) ii) 7
* a) iii) 123
* a) iv) 37
* a) v) 3

---

* b) i) No
* b) ii) Yes
* b) iii) Yes
* b) iv) Yes
* b) v) No
* b) vi) Yes
* b) vii) Yes
* b) viii) Yes
* b) ix) Yes
* b) x) Yes

---

* c) i) Method Overloading
* c) ii) `parseInt(String)` and `parseInt(String, int)`
* c) iii)
```java
public class descending {
  public static void main(String[] args) {
    int[] argsi = {
      Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])
    };
    int largestIndex = 0;
    for(int i = 0; i < 3; i++)
      if(argsi[i] > argsi[largestIndex])
        largestIndex = i;
    int mid, max;
    if(largestIndex == 0) {
      mid = Math.max(argsi[1], argsi[2]);
      max = Math.min(argsi[1], argsi[2]);
    } else if(largestIndex == 1) {
      mid = Math.max(argsi[0], argsi[2]);
      max = Math.min(argsi[0], argsi[2]);
    } else {
      mid = Math.max(argsi[1], argsi[0]);
      max = Math.min(argsi[1], argsi[0]);
    }
    System.out.println(args[largestIndex] + ", " + mid + ", " + max);
  }
}
```

---

## Question 2

* a) i)
```java
0
1
2
3
4
5
6
```

* a) ii) Array Index Out Of Bounds exception will be thrown

* b) When the user keys in more than 1000 inputs, which would cause an Array Index Out of Bounds exception.

* c)
```java
int shortestLength(String[] arr) {
    if(arr.length == 0) return 0;
    int shortLength = arr[0].length();

    for(int i = 1; i < arr.length; i++)
      if(shortLength > arr[i].length())
        shortLength = arr[i].length();
    return shortLength;
  }
```

---

## Question 3

* a)
```java
Enter Width>4
****
****
****
****
```

* b)
```java
import java.util.Scanner;
class F {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int j = 0;
    while(j < 265) {
      int i = 0;
      while(i < 100) {
        System.out.print("*");
        i++;
      }
      System.out.println();
      j++;
    }
  }
}
```


* c)
```java
  public void rightTriangle(int n) {
    for(int i =0; i < n; i++) {
      for(int j = 0; j < i; j++)
        System.out.print(" ");
      for(int k = 0; k < (n-i); k++)
        System.out.print("*");
      System.out.println();
    }
  }
 ```

---

## Question 4

* a)
```java
boolean isOdd(int n) {
  return (n%2) > 0;
}
```

* b)
```java
int syr(int n) {
    System.out.print(n + " ");
    if(n == 1) {
      return 1;
    }
    if(n % 2 > 0) {
      return syr(n * 3 + 1);
    }
    return syr(n/2);
}
```

* c)
```java
  // Exponentiation by squaring
  // https://en.wikipedia.org/wiki/Exponentiation_by_squaring
  int exponentiation(int x, int n) {
    if(n == 1) return x;
    if(n == 2) return x * x;

    if(x % 2 > 0)
      return x * exponentiation(exponentiation(x, (n - 1) / 2), 2);
    return exponentiation(exponentiation(x, n / 2), 2);
  }
```

---

## Question 5

* a) i) It will output the source code of the `filey` program.

* a) ii) When the `BufferedReader` file pointer is at the end of the file.

* a) iii) The output would be empty as the `BufferedReader` file pointer will be at the end of the file upon opening the file for reading.

* b) c

* c) `s.substring(0, s.length() - 1);`

* d)
```java
import java.io.*;

public class swapcdxy {
  public static void main(String[] args) throws Exception{
    BufferedReader inone = new BufferedReader(new FileReader(args[0]));
    int t = inone.read();
    while(t != -1) {
      if(t == (int)'a')
        System.out.print('x');
      else if(t == (int)'x')  // We are assuming that there is a typo in the paper
        System.out.print('a');
      else
        System.out.print((char)t);
      t = inone.read();
    }
  }
}
```

---

## Question 6

* a) peach

* b)
```java
public class Date {
  public int d, m, y;
  public Date(int d, int m, int y) {
    this.d = d;
    this.m = m;
    this.y = y;
  }
}
```

```java
public class Person {
  public String firstName, lastName;
  public Date d;

  public Person(String firstName, String lastName, Date d) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.d = d;
    }
}
```

* c)
```java
public class PersonOccupation extends Person {
  public String occupation;

  public PersonOccupation(String firstName, String lastName, Date d, String occupation) {
      super(firstName, lastName, d);
      this.occupation = occupation;
  }
}
```

* d)
```java
public class q6d {
  static int roll() {
    java.util.Random r = new java.util.Random();
    return r.nextInt(6) + 1;
  }
  public static void main(String[] args) {
    int consecutive = 0, i = 1;
    for(i = 1; consecutive != 3; i++) {
      if(roll() == 5)
        consecutive++;
      else
        consecutive = 0;
    }
    System.out.println(i);
  }
}
```
