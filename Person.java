package oop;

//creating class Person
public class Person {
	
	//Creating instance variables
	String name;
	  String city;
	  int age;
	  double height;
	  
	  //creating static variable
	  static int totalPeople = 0;
	  
	  //creating displayinfo() method
	  public void displayInfo() {
		  System.out.println("=== Person's Information ===");
	      System.out.println("Name: " + name);
	      System.out.println("Age: " + age);
	      System.out.println("City: " + city);
	      System.out.println("Height:" + height);
	      System.out.println();
	  }
	  
	  //creating setHeight() method
	  public void setHeight(double h) {
		  System.out.println("--- Setting height---\n");
		    double oldHeight = this.height;   // store old height
		    this.height = h;                  // update height
		    System.out.println("Height changed from " + oldHeight + " to " + height);
		}
	  
	  //Creating haveBirthday() method
	  public void haveBirthday() {
		  System.out.println("--- Birthday time ---\n");
		    age++;  
		    System.out.println("Happy Birthday " + name + "! You are now " + age + " years old.");
		}
	  
	  //Creating showTotalPeople() method
	  public static void showTotalPeople() {
		  System.out.println("Total People : " + totalPeople); }
	

}
