package a;
import java.util.Scanner;

public class GradeAverage
{
    @SuppressWarnings("resource")
	public static void main(String args[])
    {
    	
        Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int [] grades= new int[10];
        

        float total=0, average;
       
        for(int i=1;i<=numStudents; i++) { 
           System.out.print("Enter grades of student"+i+":");
          grades[i] = sc.nextInt();
          if(grades[i]>0 && grades[i]<=100) {
        	  total = total+grades[i];
          }
          else
        	  System.out.println("invalid grades");        }
        
        //Calculating average here
        average = total/numStudents;
        System.out.print("The average is: "+average);
    }
}
