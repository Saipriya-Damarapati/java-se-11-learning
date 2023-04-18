package com.learning.chapter1.lesson3;

//import java.util.Date;
//import java.sql.Date;

import java.util.*;
//import java.sql.*;

public class NameConflicts {
    Date date;
}

/*
Java provides implementations of java.util.Date and java.sql.Date.
 */

/*
The tricky cases come about when other imports are present.
import java.util.*;
import java.sql.*; // causes Date declaration to not compile
 */

/*
When the class is found in multiple packages, Java gives you a compiler error.
error: reference to Date is ambiguous
Date date;
^
both class java.sql.Date in java.sql and class java.util.Date in java.util match
 */