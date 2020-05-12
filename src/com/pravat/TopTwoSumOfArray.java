package com.pravat;

public class TopTwoSumOfArray {

  public static void main(String args[]){
    int [] listOfInt={43,14,76,34,41,42,8,32,};
    int result=sumOfTowLargestElements(listOfInt);
    System.out.println("The sum of two values:"+result);

  }
  /**
   *
   * @param listOfInt
   * @return
   */
  private static int sumOfTowLargestElements(int[] listOfInt) {
    int maxValue=Integer.MIN_VALUE;
    int secondMaxValue=Integer.MAX_VALUE;
    for (int value :listOfInt ) {
      if(value > maxValue){
        secondMaxValue=maxValue;
        maxValue=value;
      }
      else  if(value >secondMaxValue && value<maxValue){
        secondMaxValue=value;
      }
      
    }
    int sumOfValue=maxValue+secondMaxValue;
    return sumOfValue;
  }



}
