package com.learning.chapter1.lesson2;

import java.lang.*;
import java.lang.System;
import java.util.Random;

public class ImportRedundantExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}

/*
There is one special package in the java world called java.lang
This package is special in that it is automatically imported
 */

/*
In this program, 3 of the 4 import statements are redundant
line 3, 4 and 6 are redundant
 */

/*
Lines 3 and 4 are redundant because everything in java.lang is automatically considered to be imported.
Line 6 is also redundant in this example because Random is already imported from java.util.Random.
If line 3 wasn’t present, java.util.* wouldn’t be redundant, though, since it would cover importing Random.
 */