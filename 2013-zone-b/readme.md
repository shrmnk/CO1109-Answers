# 2013 Zone B Exam Paper

| **DISCLAIMER**  |
| :---: |
| This repository of documents and source codes were created with the intention of helping fellow students. No infringement of copyrights or legal rights intended. |
| Please only take these answers as a *reference* for your research purposes. |

---

## Question 01

#### Part A
* (i) 13
* (ii) 6
* (iii) 6
* (iv) 38
* (v) 0
* (vi) infinite
* (vii) 40
* (viii) infinite
* (ix) 0

#### Part B

```java
int smallest = array[0];
for (int i = 0; i < array.length; i++) {
    if (smallest > array[i]) {
        smallest = array[i];
    }
}
```

### Part C

```java
public static void main(String[] args){
    Vector<String> v = new Vector<>();
    v.add("10characters");
    v.add("aaaaaaaaaa");
    v.add("two");
    v.add("e");
    v.add("f");

    int shortest = v.get(0).length();
    for (int i = 0; i < v.size(); i++) {
        if (shortest > v.get(i).length()) {
            shortest = v.get(i).length();
        }
    }

    for ( int i = 0; i < v.size(); i++) {
        if (v.get(i).length() == shortest) {
            System.out.println(v.get(i));
        }
    }        
}
```

---

## Question 02

#### Part A
* (i) `154`
* (ii) the variable `s` was expecting an integer as value, but a `String` was assigned instead.
* (iii) variable `t` is declared twice with different values.

#### Part B

```java
double lightSpeedPerHour = 299792458 / 100 / 60;
double starDistance = lightSpeedPerHour * 24 * 365 * 4.2;
System.out.println((starDistance / 0.57) * 2);
```

#### Part C

```java
static int roll() {
    java.util.Random r = new java.util.Random();
    return r.nextInt(6) + 1;
}

public static void main(String[] args) {
    int count  = 0;
    boolean isComplete = false;
    while (!isComplete) {
    count++;
    int firstRoll = roll();
    int secondRoll = roll();
    int thirdRoll = roll();
    if (firstRoll == 1 && secondRoll == 1 && thirdRoll == 1) {
        isComplete = true;
    }        
}
    System.out.println(count);
}
```

## Question 03

#### Part A
* (i)
  * `boolean`
  * `int`
  * `double`

* (ii) Yes
* (iii) Yes
* (iv) No

#### Part B
* (i) `cat`
* (ii) `12`

#### Part C

```java
public boolean checkAnagram(String str1, String str2) {

    if (str1.length() != str2.length())
      return false;

    char[] a = str1.toCharArray();
    char[] b = str2.toCharArray();

    Arrays.sort(a);
    Arrays.sort(b);

    return Arrays.equals(a, b);
}
```

---

## Question 04

#### Part A

* (i) `-4`
* (ii) `-2`
* (iii) `-1`

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
    Object[] array;
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
> These people helped to make the above answers: @hong-yi
