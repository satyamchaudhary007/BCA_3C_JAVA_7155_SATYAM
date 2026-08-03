
//Write a java program that takes a number as input and prints its multiplication table up to 10.

import java.util.Scanner;

public class Extra_prog1{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to multiplication table printing ");

      System.out.print("please Enter Your Number : ");
      int num = input.nextInt();

      for(int i=1;i<=10; i++){
        System.out.println(num+"X"+i+"="+(num*i));
      }

  }
}