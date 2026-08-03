//print the java program to print the pattern6 in the given sheet?

class prog9pattern6{

    public static void main(String args[]){

        for(int rows=1;rows<=5;rows++){

            for(int cols=1;cols<=rows;cols++){
                System.out.print(cols);
            }
            System.out.println("");
        }
    }
}