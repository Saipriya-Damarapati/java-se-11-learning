package com.learning.chapter1.lesson3;

import java.util.Date;

/**
 * Sometimes you really do want to use Date from two different packages
 *
 * When this happens, you can pick one to use in the import
 * and use the other’s fully qualified class name
 */
public class NameFullyQualified {

    Date utilDate;
    java.sql.Date sqlDate;
}