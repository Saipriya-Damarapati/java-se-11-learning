package com.learning.chapter1.lesson1;

/**
 * This program is to demonstarte the compilation error
 * uncomment the line 9 to understand the program
 */
public class Learning {
    public static void main(String[] args) {
        //UH-OH; // This line is intentionally commented for the workspace to remain error free
        System.out.println("Compilation Error");
    }
}

/*
Notes
--------
Java does not accept anything you write

Java is still a compiled language, which means the code is being
compiled in memory and the java command can give you a compiler
error.
 */

/*
C:\Users\Sai Priya\git\java_11_cmd_learn>javac Learning.java
Learning.java:3: error: not a statement
                UH-OH;
                  ^
1 error
 */
