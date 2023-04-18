package com.learning.chapter1.lesson3;

import java.util.Date;
//import java.sql.Date;

public class NameConflictsTieAndPrecedence {

    Date date;
}

/*
Uncomment the second import statement to see the below output.

C:\Users\Sai Priya\git\java_11_cmd_learn\Chapter1>javac NameConflictsTieAndPrecedence.java
NameConflictsTieAndPrecedence.java:6: error: reference to Date is ambiguous
        Date date;
        ^
  both class java.util.Date in java.util and class java.sql.Date in java.sql match
NameConflictsTieAndPrecedence.java:2: error: a type with the same simple name is already defined by the single-type-import of Date
import java.sql.Date;
^
2 errors
 */

/*
Notes
-------
Java is smart enough to detect that this code is no good.
As a programmer, you’ve claimed to explicitly want the default to be both the java.util.Date and java.sql.Date implementations.
Because there can’t be two defaults, the compiler tells you the following:
error: reference to Date is ambiguous
Date date;
^
both class java.util.Date in java.util and class java.sql.Date in java.sql match
 */