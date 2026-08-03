//Write a java program to get a number from the user and print whether it is positive or negative. 

import java.util.Scanner;

public class Extra_prog6{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to chack number is posative or negative ");

      System.out.print("please Enter Your Number : ");
      int num = input.nextInt();
      
      if(num > 0){
        System.out.println("Number is posative");
      }else if(num < 0){
        System.out.println("Number is negative");
      }
  }
}