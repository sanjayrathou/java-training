package oops;

public class Animal {
	
    int age ;       
    String color ;   // DECLARING THE ATTRIBUTES.

	public void run() {
	
		System.out.println("I am running");
	}
	
	public void bark() {
		
		System.out.println("I am barking");
	}
	
	
	public static void main(String[] args) { 
		
//   MAIN METHOD CONSIST OF STATIC KEYWORD  SO IT DOESN'T REQUIRES TO CRETE THE OBJECT.
		
		                                       
		
		Animal dog = new Animal();    // CREATING THE OBJECT OF ANIMAL CLASS.
		
		dog.run();                   // CALLING THE RUN() METHOD.
		dog.bark();
		dog.color = "red";          // INITIALIZING THE ATTRIBUTE COLOR OF ANIMAL CLASS. 
		dog.age = 12;
		
		Birds bird = new Birds();     // CREATING THE OBJECT OF BIRD CLASS.
		
		bird.fly() ;                 
		bird.age = 2;                 // INITIALIZING THE ATTRIBUTE AGE OF CLASS BIRDS. 
		
	}

}

class Birds {                    // CREATING ANOTHER CLASS.
	
	int age;
	
	
	void fly() {
		
		System.out.println("I am flying.");
	}

	
}

	

