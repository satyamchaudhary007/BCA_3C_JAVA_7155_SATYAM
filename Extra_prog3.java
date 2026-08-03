// Write a java program to swap two variables with and without 'temp' variable.


import java.util.Scanner;

public class Extra_prog3{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to number Swapping ");

      System.out.print("please Enter Your 1st Number : ");
      int num1 = input.nextInt();

      System.out.print("please Enter Your 2nd  Number : ");
      int num2 = input.nextInt();

      System.out.println("Before Swapping Your Number is : " + num1 +" "+num2);
      System.out.println();

      // with temp variable
      int temp = num1;
      num1 = num2;
      num2 = temp;

      //without temp variable 
      num1 = num1+num2;
      num2 = num1-num2;
      num1 = num1-num2;

      System.out.println("After Swapping Your Number is : "+num1+" "+num2);
  }
}