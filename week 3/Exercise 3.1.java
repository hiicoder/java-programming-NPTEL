//This program is related to the generation of Fibonacci numbers.>

//For example: 0,1, 1,2, 3,5, 8, 13,… is a Fibonacci sequence where 13 is the 8th Fibonacci number.
//-------------------------------------------------------------------------------------------------------
import java.util.Scanner; //This package for reading input
public class Fibonacci { 

public static void main(String args[]) { 
	 Scanner sc = new Scanner(System.in);
	int n=sc.nextInt(); //Read an integer
System.out.println(fib(n)); //Generate and print the n-th Fibonacci                
                                     //number
    } 
static int fib(int n) {
  //------------------------------------------------------------------------------------------
  //complete the code segment to find the nth Fibonacci number in the Fibonacci sequence and return the value. Write the function recursively.
int num =0;
int num2 = 1;
int num3 = 1;
//System.out.print(num+","+num2);
for(int i = 2;i<n;i++){
	num3 = num+num2;	
  num = num2;
  num2 = num3;
} 
return (num3);
}
}
