//write a java program to print the pattern9 from the given sheet?

class prog9pattern9{

    public static void main(String arg[]){

        for(int rows=5;rows>=1;rows--){

            for(int cols=5;cols>=6-rows;cols--){
                System.out.print(cols + "");
            }
            System.out.println();
        }
    }
}