//write a java program to print the pattern2.it is a mirror of pattern1?

class pattern2{

    public static void main(String args[]){

        int rows;
        int cols;

       for(rows=1;rows<=5;rows++){
         
         for(int space=1;space<=5-rows;space++){
            System.out.print("  ");
         }

           for(cols=1;cols<=rows;cols++){
            System.out.print(" *");

           }
           System.out.println("");
       }
    }
}