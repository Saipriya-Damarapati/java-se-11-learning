package com.learning.chapter1.lesson2;

import java.util.Random;

public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}

/*
Above code on execution without any import statements
---------------------------------------------------------------

C:\Users\Sai Priya\git\java_11_cmd_learn>javac ImportExample.java
ImportExample.java:3: error: cannot find symbol
                Random r = new Random();
                ^
  symbol:   class Random
  location: class ImportExample
ImportExample.java:3: error: cannot find symbol
                Random r = new Random();
                               ^
  symbol:   class Random
  location: class ImportExample
2 errors
 */

/*
Notes
----------
This error could mean you made a typo in the name of the class.
You double-check and discover that you didn’t.
The other cause of this error is omitting a needed import statement.
Import statements tell Java which packages to look in for classes.
Since you didn’t tell Java where to look for Random, it has no clue.
-----------
* is a wildcard that matches all the classes in a package
it does not import child packages, fields or methods, it imports only classes
You might think that including so many classes slows down your program execution, but it doesn’t. The compiler figures out what’s actually needed.
 */