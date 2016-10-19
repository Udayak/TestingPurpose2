package com.uday.java;

public class RandomNumbers {

  public static void main(String[] args) {


    for (int i = 0; i < 10; i++) {
      System.out.println(getRandomNumberInRange(16, 20));
    }

  }

  private static int getRandomNumberInRange(int min, int max) {

    if (min >= max) {
      throw new IllegalArgumentException("max must be greater than min");
    }

    return (int) (Math.random() * ((max - min) + 1)) + min;
  }


}
