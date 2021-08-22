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
int first =0;
int second = 1;
//System.out.print(num+","+num2);
for(int i = 1;i<n;i++){
int third = first+second;	
  first = second;
  second = third;
} 
return (first);
}
}
