package com.core.java.ExceptionHandling;

import util.KeyboardReader;

public class FinallyTest {
public static void main(String[] args) {
System.out.println("Returned value is " + go());
}
public static int go() {
int choice = 0;
try {
String name = KeyboardReader.getPromptedString("Enter your name: "
System.out.println("MENU:");
System.out.println("1 - normal execution");
System.out.println("2 - uncaught ArithmeticException");
System.out.println("3 - return from try block");
System.out.println("4 - call System.exit");
System.out.println(
"5 - return 5 from finally after ArithmeticException");
System.out.println(
"6 - return 6 from finally after try returns -1");
System.out.println("X - catch NumberFormatException");
choice = KeyboardReader.getPromptedInt("Enter your choice: ");
if (choice == 1) System.out.println("Hello " + name);
else if (choice == 2) System.out.println("1 / 0 = " + 1/0);
else if (choice == 3) return 3;
else if (choice == 4) System.exit(1);
else if (choice == 5) System.out.println("1 / 0 = " + 1/0);
else if (choice == 6) return -1;
}
catch (NumberFormatException e) {
System.out.println("Number Format Exception occurred");
}
finally {
System.out.println("Goodbye from finally block");
if (choice == 5) return 5;
if (choice == 6) return 6;
}
return 0;
}
}
