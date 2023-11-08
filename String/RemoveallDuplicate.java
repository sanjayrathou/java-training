package Strings;

public class RemoveallDuplicate {
    static String removeAll(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if(sb.length() > 0 && sb.charAt(sb.length()-1) == s.charAt(i)){
                sb.deleteCharAt(sb.length()-1);
            }else {
                sb.append(s.charAt(i));

            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(RemoveallDuplicate.removeAll("abbb"));
    }
}
