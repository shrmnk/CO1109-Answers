# 2008 Zone B Answers

| **DISCLAIMER**  |
| :---: |
| This repository of documents and source codes were created with the intention of helping fellow students. No infringement of copyrights or legal rights intended. |
| Please only take these answers as a *reference* for your research purposes. |

---

## Question 1

* a) i) Missing closing braces for the class.
* a) ii) No initialization of a variable named `t`. Supposed to be `String t = "hello";`
* a) iii) Type mismatch. An `int` cannot have a `boolean` value.

---

* b) i)
```java
for (int i = 0; i < 959595; i ++) {
	System.out.println("cheers");
}
```

---

* c)
```java
import java.util.Random;
public static void main(String[] args) {
	Random r = new Random();
	int value = r.nextInt(2);
	if (value == 0) {
		System.out.println("heads");
	} else {
		System.out.println("tails");
	}
}
```

---

## Work-in-Progress

---

###### Contributors
> These people helped to make the above answers: [@yanyi](https://github.com/yanyi)
