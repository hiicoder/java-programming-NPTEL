import java.util.Scanner;
public class Exercise1_3 {
      public static void main(String[] args) {
	   	Scanner sc = new Scanner(System.in);
	   	int n=sc.nextInt();
	  	int sum=0;
			//Use for or while loop do the operation.
 			for(int i = 0; i < n; i++)
        {   
            int res = i * 2;
            if(res % 3 == 0)
            {
            	sum += res ;
          		System.out.print(sum);
            }
        }
			}
}
			
         
