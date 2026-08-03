// Write a java program that takes three numbers from the user and prints the smaller and bigger number.

import java.util.Scanner;

public class Extra_prog7{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Welcome to check number is largest or smaller");

      System.out.print("Please Enter Your First Number : ");
      int num1 = input.nextInt();

      System.out.print("Please Enter Your Second Number : ");
      int num2 = input.nextInt();

      System.out.print(" Now Please Enter Your Third Number : ");
      int num3 = input.nextInt();

      if(num1 > num2 && num1 > num3){
        System.out.println("the largest Number is : "+num1);
      }else if (num2 > num1 && num2 > num3){
        System.out.println("the largest Number is : "+num2);
      }else if (num3 > num1 && num3 > num2){
        System.out.println("the largest Number is : "+num3);
      }

      if(num1 < num2 && num1 < num3){
        System.out.println("the smallest Number is : "+num1);
      }else if (num2 < num1 && num2 < num3){
        System.out.println("the smallest Number is : "+num2);
      }else if (num3 < num1 && num3 < num2){
        System.out.println("the smallest Number is : "+num3);
      }
  }
}