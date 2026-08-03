// Write a java program to accept a number and check whether the number is even or odd. Prints 0 if number is odd else 1 if number is.


import java.util.Scanner;

public class Extra_prog4{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to number Cheker Odd or Even ");

      System.out.print("please Enter Your Number : ");
      int num = input.nextInt();
      int result = OddEven(num);
      System.out.println(result);
  }
  public static int  OddEven (int num) {
    if(num % 2 == 0){
      return 1;
    }else{
      return 0;
    }
  }
}