package com.pravat;

import java.util.Arrays;

public class Zeor {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    int[] testingArray = {4,7,9,2,-1};

    int result = getClosestToZero(testingArray);

    System.out.println("The Closest Number To Zero in this Array is : " + result);

  }

  public static int getClosestToZero(int[] a) {
    int currentValue = 0;
    int closestVal = a[0];
    Arrays.sort(a);


    for (int index = 0; index < a.length; index++) {
      currentValue = a[index] * a[index];
      if (currentValue <= (closestVal * closestVal)) {
        closestVal = a[index];
      }
    }
    return closestVal;
  }

}
