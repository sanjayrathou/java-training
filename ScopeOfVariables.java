package college;



public class ScopeOfVariables {
	
	static int x = 6;                  // CLASS LEVEL SCOPE (STATIC VARIABLE).
    int y = 7;
	
	static void fun() {
		
		int x = 9;                   // METHOD LEVEL SCOPE (LOCAL VARIABLE)
		
		{   
			int y = 8;
		System.out.println(x);      //  BLOCK LEVEL SCOPE  
		System.out.println(y);
		}
		
//		System.out.println(y);         // IT CAN'T ACCESS VARIABLE Y OUTSIDE THE BLOCK.     
		
	}
	
	public static void main(String[] args) {
	//	int x = 8;
		System.out.println(x);           // A VARIABLE NEED TO BE STAIC TO BE ACCESSED EVERYWHERE INSIDE THE CLASS.
		fun();
		
	}
	
}
