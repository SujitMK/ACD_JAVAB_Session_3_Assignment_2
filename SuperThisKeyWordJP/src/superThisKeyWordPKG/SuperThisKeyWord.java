package superThisKeyWordPKG;

public class SuperThisKeyWord {

	public static void main(String[] args) {
		
		
		System.out.println();                                             // To give a line gap from top
		System.out.println("Welcome! Your Inside SuperThisKeyWord Class. ");

		ChildClass cc = new ChildClass(7);                                   // creating a child class object
		
		
		// Printing Child Class Variables values before using this keyword
		
		System.out.println();
		System.out.println("The values of cName and cFavrtNum of Child Class are printed using object reference before using this keyword as below.");
		System.out.println("Name : "+ cc.cName+ " and Favourate Number : "+ cc.cFavrtNum);
		
		// calling a Child Class method by passing values and Printing Child Class Variables values using this keyword
		cc.printChildInfo("Virat", 18);
		System.out.println();
		System.out.println("The values of cName and cFavrtNum of Child Class are printed using object reference after using this keyword as below.");
		System.out.println("Name : "+ cc.cName+ " and Favourate Number : "+ cc.cFavrtNum);
	}

}
