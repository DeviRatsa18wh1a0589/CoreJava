import java.util.Scanner;
public class DateChanging {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int month[] = {31,28,30,30,31,30,31,31,30,31,30,31};
    int d,m,y,nd,nm,ny,ndays;
      System.out.println("enter the date, month,year");
           Scanner sc = new Scanner(System.in);
           d = sc.nextInt();
           m=sc.nextInt();
           y=sc.nextInt();
      System.out.println("givn date "+d +"/" +m+"/" +y);
            ndays = month[m-1];
            if(m==2) {
	         if(y%100==0)
	           if(y%400==0) 
	              ndays=28;
	           }
              else
	            if(y%4==0) {
	              ndays=29;
	          }
	         	nd=d+1;
	            nm=m;
	            ny=y;
	         if(nd>ndays) {
		     nd=1;
		     nm++;
	       }
	        if(nm>12) {
	     	nm=1;
		    ny++;
	     }
	        System.out.println("Next Date is "+nd+"/" +nm+"/" +ny);
	
	     }
}