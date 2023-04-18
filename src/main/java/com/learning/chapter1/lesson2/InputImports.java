package com.learning.chapter1.lesson2;

import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InputImports {
    public void read(Files files) {
        Paths.get("Name");
    }
}

/*
What imports do you think would work to get this code to compile?

There are two possible answers. The shorter one is to use a wildcard to import both at the same time.
import java.nio.file.*;

The other answer is to import both classes explicitly.
import java.nio.file.Files;
import java.nio.file.Paths;
 */


/*
Imports below will not work

import java.nio.*;              //  a wildcard only matches class names, not "file.Files"
import java.nio.*.*;            // you can have only one wildcard, that must be at the end
import java.nio.file.Paths.*;   // methods cannot be imported, only class names can be imported
 */


/*
C:\Users\Sai Priya\git\java_11_cmd_learn\Chapter1>javac InputImports.java
InputImports.java:3: error: cannot find symbol
        public void read(Files files) {
                         ^
  symbol:   class Files
  location: class InputImports
InputImports.java:4: error: cannot find symbol
                Paths.get("Name");
                ^
  symbol:   variable Paths
  location: class InputImports
2 errors
 */