//8_1 WRITE A JAVA PROGRAM TO FIND ODD OR EVEN NUMBER USING COMMAND LINE ARGUMENT.

class prog8_1{
		
		
		public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		
		if(a%2==0){
		   System.out.print("given number is even");
		}
		else{
		  System.out.print("given number is odd");
		}
		
 }		
}		
		