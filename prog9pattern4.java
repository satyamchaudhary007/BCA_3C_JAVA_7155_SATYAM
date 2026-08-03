//write a java program to print the pattern4.it is a mirror of pattern3

class prog9pattern4{

    public static void main (String args[]){

       for(int rows=5;rows>=1;rows--){
         
         for(int space=1;space<=5-rows;space++){
            System.out.print("  ");
         }
         for(int cols=1;cols<=rows;cols++){
            System.out.print(" *");
         }

         System.out.println("");

       } 
    }
}