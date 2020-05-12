package com.pravat;

import java.util.Scanner;

public class FizzBuzz {

  public void getFizzBuzz(int number){
    if(number %3==0 && number%5==0 ){
      System.out.println("FizzBuzz");
    }
    else if(number%3==0){
      System.out.println("Fizz");
    }
    else if(number%5==0){
      System.out.println("BUzz");
    }
    else
      System.out.println(number);
  }
  public static void main(String args[]){
    FizzBuzz fizzBuzz=new FizzBuzz();

    Scanner scanner=new Scanner(System.in);
    System.out.println("Please enter  the number");
    int n=scanner.nextInt();
    System.out.println("Number is :"+n);
    fizzBuzz.getFizzBuzz(n);
  }
}
