//write a java program to print the pattern7 from the given sheet?

class prog9pattern7{

    public static void main(String args[]){

        int num=1;
        for(int rows=1;rows<=5;rows++){

            for(int cols=1;cols<=rows;cols++){
                System.out.print(num + "");
                num++;
            }
            System.out.println();

        }
    }
}