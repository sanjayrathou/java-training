import java.util.*;
public class PatternMatching {
    public static void main(String[] args) {
        String str = "ABCABCD";
        String pattern = "ABCD";
        for(int i = 0;i<=(str.length()-pattern.length()); i++){
            int j;
            for( j = 0; j<pattern.length();j++){
                if(pattern.charAt(j)!=str.charAt(i+j)) {
                    break;
                }
            }
            if(j == pattern.length() ){
                System.out.println("Pattern found at : "+ i);
            }
        }

    }
}
