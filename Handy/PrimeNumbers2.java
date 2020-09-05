import java.util.Scanner;

// Source: https://web.archive.org/web/20200615185250/https://beginnersbook.com/2014/01/java-program-to-display-prime-numbers/
public class PrimeNumbers2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      Scanner scanner = new Scanner(System.in);
	      int i =0;
	      int num =0;
	      //Empty String
	      String  primeNumbers = "";
	      System.out.println("Enter the value of n:");
	      int n = scanner.nextInt();
	      scanner.close();
	      for (i = 1; i <= n; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    //Appended the Prime number to the String
		    primeNumbers = primeNumbers + i + " ";
		 }	
	      }	
	      System.out.println("Prime numbers from 1 to n are :");
	      System.out.println(primeNumbers);
	}

}
