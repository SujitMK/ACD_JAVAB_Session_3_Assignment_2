package superThisKeyWordPKG;

public class ChildClass extends ParentClass{
	
	// Declaring and Initializing the child class instance variables
	
	String cName = "AJIT";
	int cFavrtNum = 16;
	 
	public ChildClass()                                                                // Child class constructor
	{
		super();
		System.out.println();
		System.out.println("The Child Class default constructor is called using this keyword. ");
		System.out.println("Welcome! Your Inside Child Class. ");
	}
	
	public ChildClass(int A)                                                                // Child class parameterized constructor
	{
		this();
		System.out.println();
		System.out.println("Welcome! Your Inside Parameterized Child Class Constructor. ");
	}
	
	public void thisMethod()
	{
		System.out.println();
		System.out.println("The method is called using this keyword inside printChildInfo method in Child Class.");
		System.out.println("Welcome! Your Inside This Method.");
	}
	
	public void printChildInfo(String cName, int cFavrtNum)                            // Child class method
	{
		
		this.thisMethod();                                 // Calling method using thiskeyword
		
		// Printing the Parent Class variables values using super keyword
		
		System.out.println();
		System.out.println("The values of pName and pFavrtNum of Parent Class are printed using super keyword as below.");
		System.out.println("Name : "+super.pName+ " and Favourate Number : "+ super.pFavrtNum);
		
		// Printing the  printChildInfo method variables values without using this keyword
		
		System.out.println();
		System.out.println("The method is called using super keyword to print the parent method content.");
		super.printParentInfo();
		
		this.cName = cName;
		this.cFavrtNum = cFavrtNum;
	}

}
