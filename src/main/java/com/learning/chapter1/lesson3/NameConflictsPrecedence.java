package com.learning.chapter1.lesson3;

/**
 * In the below case,
 * import java.util.Date;
 * import java.sql.Date;
 * But what do we do if we need a util Date and whole pile of other classes in the java.sql package?
 *
 * If you explicitly import a class name, it takes precedence over any wildcards present.
 * Java thinks, “The programmer really wants me to assume use of the java.util.Date class.”
 */
import java.util.Date;
import java.sql.*;

public class NameConflictsPrecedence {
    Date date;
    Connection con;
}

// This program compiles without any issue