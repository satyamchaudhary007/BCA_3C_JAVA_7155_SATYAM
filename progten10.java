//WRITE A JAVA PROGRAM OF 1D ARRAY.

import java.util.Scanner;

public class prog10_1{

public static void main(String args[]){
Scanner scn = new Scanner(System.in);

int[] marks = new int[5];

for(int i=0;i<marks.length;i++){
  
  System.out.print("enter the element of array:");
  marks[i]=scn.nextInt();

}

System.out.println("array element are:");

for(int i=0;i<marks.length;i++){

System.out.print(marks[i]);

}

}
}