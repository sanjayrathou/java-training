package StringRecursion;

public class Recursion1 {
	static String removeAllOccurence(String s, int idx ) {
		
		if(idx == s.length()) {
			return "";
		}
		
		String smallAns = removeAllOccurence(s, idx + 1);
		
		char currentChar = s.charAt(idx);
		
		if(currentChar != 'a') {
			
			smallAns =  currentChar + smallAns;
		}
		return smallAns;
		
	}
	
	public static void main(String[] args) {
		
	    String s = "Sanjay Rathour";	
	    
	    System.out.println(removeAllOccurence(s, 0));
	}

}
