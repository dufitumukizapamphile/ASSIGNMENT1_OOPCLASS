package oop;

public class PersonTest {
	 public static void main(String[] args) {
	
	   // Creating first person
		 
    Person person1 = new Person();
    person1.name = "James";
    person1.age = 25;
    person1.city ="Gikondo";
    person1.height = 5.9;
    Person.totalPeople++;
    
    person1.displayInfo();
    
    // Creating second person
 
    Person person2 = new Person();
    person2.name = "Janet";
    person2.age = 29;
    person2.city = "Gatenga";
    person2.height = 6.0;
    Person.totalPeople++;
    
    person2.displayInfo();
    
    // Creating third person
    
    
    Person person3 = new Person();
    person3.name = "Alex";
    person3.age =48;
    person3.city = "Rebero";
    person3.height = 6.8;
    Person.totalPeople++;
    
    person3.displayInfo();
    
   
    // Test setHeight() 
    person1.setHeight(6.0);
    person2.setHeight(6.2);
    
    //Test haveBirthday()
    person2.haveBirthday();
    
    
    System.out.println("--- Creating 5 more people using a loop ---\n");

    for (int i = 1; i <= 5; i++) {
        Person tempPerson = new Person();

        tempPerson.name = "Person " + i;
        tempPerson.age = 18 + i;
        tempPerson.height = 5.0 + (i * 0.2);
        tempPerson.city = "City " + i;
        Person.totalPeople++;
        tempPerson.displayInfo();
    }
    
    
 // Show final total
    Person.showTotalPeople();
    
    
    
    
    
    
    
    
    
    
}
    
}

