package com.uday.java;

public class StaticDeclaration {

  // 1st block
  static {
    System.out.println("\n I am Static Block1");
    setTestString("This is static block string");
    setTestValue(2);
  }

  // 2nd block
  static {
    System.out.println("\n I'm static Block2 ");
  }
  private static int testValue;

  public static int getTestValue() {
    return testValue;
  }

  public static void setTestValue(int testValue) {
    StaticDeclaration.testValue = testValue;
  }

  private static void setTestString(String string) {
    System.out.println(string);
  }

  public static void main(String[] args) {
    if (testValue > 0) {
      System.out.println("setTestValue method:" + testValue);
    }
  }
}
