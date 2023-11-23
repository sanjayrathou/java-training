package Strings;

public class UpperCaseToLower {
    static String caseChange(String s){
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++){
            if(arr[i] >= 'A' && arr[i] <= 'Z' ){
                arr[i] = (char) (arr[i] - 'A' + 'a');
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println( UpperCaseToLower.caseChange("Sanjay Rathour"));

    }
}
