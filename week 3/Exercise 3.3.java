//The class Test1 should include two overloading constructors as appropriate for some object instantiation shown in main() method. 
//------------------------------------------------------------
import java.util.Scanner;
class Shape{
double length, breadth;
Shape(double l, double b){ //Constructor to initialize a Shape object  
length = l;
breadth= b;
}
Shape(double len){    //Constructor to initialize another Shape object  
length = breadth = len;
}
double calculate(){// To calculate the area of a shape object
return length * breadth ;
}
}
public class Test1 extends Shape{    
//-------------------------------------------------------------------
//Create a derived class constructor which can call the one parametrized constructor of the base class
double height;
Test1(double l, double h){
  super(l);
  height = h;
}
//Create a derived class constructor which can call the two parametrized constructor of the base class
Test1(double l, double b, double h){
super(l,b);
  height =h;
}
//Override the method calculate() in the derived class to find the volume of a shape instead of finding the area of a shape
double calculate(){
return length*breadth*height;
}
//-------------------------------------------
  //Create a derived class constructor which can call the one parametrized constructor of the base class
double height;
Test1(double l, double h){
  super(l);
  height = h;
}
//Create a derived class constructor which can call the two parametrized constructor of the base class
Test1(double l, double b, double h){
super(l,b);
  height =h;
}
//Override the method calculate() in the derived class to find the volume of a shape instead of finding the area of a shape
double calculate(){
return length*breadth*height;
}
