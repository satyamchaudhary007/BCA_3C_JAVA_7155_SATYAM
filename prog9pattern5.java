//write a java program to print the pattern5.

class prog9pattern5{
    public static void main(String args[]){

        for(int rows=1;rows<=5;rows++){

            for(int cols=1;cols<=rows;cols++){
                System.out.print(rows);
            }
            System.out.println("");
        }
    }
}