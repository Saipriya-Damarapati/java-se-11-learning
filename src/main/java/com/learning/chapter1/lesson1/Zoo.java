package com.learning.chapter1.lesson1;

/**
 * Sample program to demonstarte a Java class with a main method having the command line arguments
 */
public class Zoo {
    public static void main(String... args) {
        System.out.println("In class zoo");
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}

/*
Single line execution does not generate the class file

C:\Users\Sai Priya\git\java_11_cmd_learn>java Zoo.java Monkey Donkey
In class zoo
Monkey
Donkey

C:\Users\Sai Priya\git\java_11_cmd_learn>javac Zoo.java

C:\Users\Sai Priya\git\java_11_cmd_learn>java Zoo Monkey Donkey
In class zoo
Monkey
Donkey

C:\Users\Sai Priya\git\java_11_cmd_learn>java Zoo Monkey "Donkey Baby"
In class zoo
Monkey
Donkey Baby

C:\Users\Sai Priya\git\java_11_cmd_learn>java Zoo
In class zoo
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at Zoo.main(Zoo.java:4)

 */

/*
Notes
-------
This feature is called launching single file source-code programs.
The name cleverly tells you that it can be used only if your program is one file.

Even if the code compiles properly, no .class file is created.
This faster way of launching single-file source-code programs will save you time

This means if your program has two .java files, you still need to use javac.
By contrast, you cannot use this new feature for a single-file program with two classes in it.
In fact, you can’t refer to any .class files that didn’t come with the JDK.
 */