package superThisKeyWordPKG;

public class ParentClass {
	
	
	public ParentClass()                                     // Parent class constructor
	{
		System.out.println();
		System.out.println("The Parent Class Default Constructor is called using Super keyword by Child Class Constructor. ");
		System.out.println("Welcome! Your Inside Parent Class. ");
	}
	
	// Declaring and Initializing the parent class instance variables
	
	String pName = "SUJIT";       
	int pFavrtNum = 7;
	
	public void printParentInfo()                              // Parent class method
	{
		System.out.println("Thank you! You have print this using super keyword.");
	}
	
}
