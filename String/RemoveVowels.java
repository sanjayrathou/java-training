package Strings;

public class RemoveVowels {

    public static void main(String[] args) {

            String s = "sanjay rathour";
//            for(int i = 0 ; i < s.length(); i++){
//                char c = s.charAt(i);
//                if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
//                    continue;
//                }
//                System.out.print(c);
//            }
        System.out.println(s.replaceAll("[aeiou]",""));

        System.out.println(s.replaceAll("\\s",""));        //  this will remove all spaces.
    }

}
