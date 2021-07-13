/*check whether the number is an Armstrong number or not.

Armstrong Number:

example 153 = 13+53+33, 370, 371, 407, etc.
*/
import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
      //Use while loop check the number is Armstrong or not.
      int remainder = 0;
			int temp = n;
		  while(n > 0)
      {
          //geting remainder
          remainder = n % 10;
          //getting quotient;
          n = n/10;
          result +=(remainder*remainder*remainder); 
      }
//store the output(1 or 0) in result variable.
      if(temp == result)
      {
	      System.out.print(1);
      }
      else
      {
      System.out.print(0);
      }      
    }
}
