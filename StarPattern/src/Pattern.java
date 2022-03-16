import java.util.Scanner;

public class Pattern {
			
        int i,j,k,number;
        Scanner user_input;
        public Pattern() {

	   user_input=new  Scanner(System.in);
	   System.out.print("enter number of layers for pyramid");		
	   number=user_input.nextInt();
	
	    for(i=1;i<=number;i++) {
	    	
		    for(j=i;j<number;j++)
		        System.out.print(" ");
		    for(k=1;k<(i*2);k++)
			    System.out.print("*");
		System.out.print("\n");
	}
}
	public static void main(String[] args) {
		Pattern obj = new Pattern();
	}
}
	
			