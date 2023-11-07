package Strings;

public class RemoveChar {
    static String removeChar(String s, int k){
        StringBuilder sb = new StringBuilder();
        char prevChar = s.charAt(0);
        sb.append(prevChar);
        int count = 1;
        for(int i = 1; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if(currentChar != prevChar){
                sb.append(currentChar);
                prevChar = currentChar;
            }

            if(currentChar == prevChar){
                sb.append(currentChar);
                count++;
                if(count == k){
                    sb.delete(i-k+1, i+1);
                }
                count = 1;
                prevChar = s.charAt(i-k);
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println(RemoveChar.removeChar("saaaanjjjay",2));
    }
}
