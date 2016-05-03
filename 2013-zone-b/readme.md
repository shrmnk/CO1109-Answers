# 2013 Zone B Exam Paper

| **DISCLAIMER**  |
| :---: |
| This repository of documents and source codes were created with the intention of helping fellow students. No infringement of copyrights or legal rights intended. |
| Please only take these answers as a *reference* for your research purposes. |

---

## Question 01

#### Part A
* (i) 12
* (ii) 6
* (iii) 6
* (iv) 39
* (v) 0
* (vi) infinite
* (vii) 40
* (viii) infinite
* (ix) 0

#### Part B

```java
int smallestElement(int[] array) {
    int smallest = array[0];
    for (int i = 0; i < array.length; i++) {
        if (smallest > array[i]) {
            smallest = array[i];
        }
    }
    return smallest;
}
```

### Part C

```java
Vector<String> getShortestStrings(Vector<String> v) {
    Vector<String> ret = new Vector<>();
    int shortest = v.get(0).length();

    // This loop goes through the given Vector to find the length of the
    // Shortest String
    for (int i = 1; i < v.size(); i++) {
        if (shortest > v.get(i).length()) {
            shortest = v.get(i).length();
        }
    }
    // The following loop looks through the vector to collect
    // elements whose length == shortest into the Vector ret
    for (int i = 0; i < v.size(); i++) {
        if (v.get(i).length() == shortest) {
            ret.add(v.get(i));
        }
    }

    return ret;
}
```

---

## Question 02

#### Part A
* (i) `154`
* (ii) The variable `s` is declared as an `int`, but a `String` value was assigned instead.
* (iii) The variable `t` is declared twice.

#### Part B

```java
class q2b {
    public static void main(String[] args) {
        double lightSpeedPerHour = 299792458 / 100 / 60;
        double starDistance = lightSpeedPerHour * 24 * 365 * 4.2;
        System.out.println((starDistance / 0.57) * 2);
    }
}
```

#### Part C

```java
class q2c {
    static int roll() {
        java.util.Random r = new java.util.Random();
        return r.nextInt(6) + 1;
    }

    public static void main(String[] args) {
        int count = 0, consecutiveOnes = 0;
        while (consecutiveOnes < 3) {
            count++;
            if (roll() == 1) {
                consecutiveOnes++;
            } else {
                consecutiveOnes = 0;
            }
        }
        System.out.println(count);
    }
}
```

## Question 03

#### Part A
* (i)
  * `boolean`
  * `double`
  * `int`

* (ii) Yes

* (iii) Yes

* (iv) No

#### Part B
* (i) `cat`
* (ii) Will not compile - non-static method `f(int)` cannot be referenced from a static context. However, assuming `f(int)` were to be declared as `static`, then the output would be `12`.

#### Part C

```java
import java.util.Arrays;
class q3c {
    public static void main(String[] args) {
        if(args.length >= 2) {
            if(isPermutation(args[0], args[1])) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    static boolean isPermutation(String str1, String str2) {

        if (str1.length() != str2.length())
          return false;

        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}

```

---

## Question 04

#### Part A

* (i) `-4`
* (ii) `-2`
* (iii) `1`

#### Part B

* (i) This is an example of method overloading

```java
class D extends C {
    String h() {
        //this is method overriding
        return "h"
    }

    int h() {
        //this is method overloading
        return 0;
    }
}
```

#### Part C

```java
class Arr {
    private Object[] array;
    public Arr(Object[] array) {
        this.array = array;
    }

    public String toString() {
        String result;
        for (int i = 0; i < array.length; i++) {
            result += array[i] + ";";
        }
        return result;
    }
}
```

---

###### Contributors
> These people helped to make the above answers: @hong-yi @shrmnk
