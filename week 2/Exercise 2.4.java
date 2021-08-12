//Q.2  To call the method  print() of class given class Printer to print the following.

// This is the class named Printer
class Printer { 
    // This are the methods in class Printer
    public void print() { 
		System.out.println("Hi! I class SCHOOL."); 
    } 
    public void print(String s) { 
		System.out.println(s); 
    } 
} 

public class Question22{ 
    public static void main(String[] args) { 
//-------------------------------------------
      // Create an object of class Printer
Printer printer = new Printer();
// Call 'print()' methods for desired output
printer.print("Hi! I am class STUDENT");
printer.print();
    }
}
