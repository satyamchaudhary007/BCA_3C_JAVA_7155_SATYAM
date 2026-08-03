//Write a java program to print numbers between 1 and 100 divisible by 3, 5 and both.

import java.util.Scanner;

public class Extra_prog5{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to chack number is divisible by 3, 5 and both ");

      System.out.print("please Enter Your Number : ");
      int num = input.nextInt();
      System.out.println("Your Number is dividable by 3");
      for(int i=1;i<=num; i++){
        if(i % 3 == 0){
          System.out.println(i);
        }
      }
      System.out.println();
      System.out.println("Your Number is dividable by 5");
      for(int i=1;i<=num; i++){
        if(i % 5 == 0){
          System.out.println(i);
        }
      }
      System.out.println();
      System.out.println("Your Number is dividable by 3 and 5 Both");
      for(int i=1;i<=num; i++){
        if(i % 3 == 0 && i % 5 == 0){
          System.out.println(i);
        }
      }
  }
}