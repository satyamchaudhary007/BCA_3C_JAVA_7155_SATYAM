//write a java program to print the pattern3.
class prog9pattern3{

    public static void main(String args[]){
        
        for(int rows=5;rows>=1;rows--){
            
            for(int cols=1;cols<=rows;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}