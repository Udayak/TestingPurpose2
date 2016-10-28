package com.uday.creational.designpatterns;

import java.util.Arrays;
import java.util.List;

public class AdapterTest {

  public static void main(String[] args) {

    Integer[] arrayValues = new Integer[] {10, 20, 30, 40};
    List<Integer> listValues = Arrays.asList(arrayValues);
    System.out.println(arrayValues);
    System.out.println(listValues);



  }

}
