package Strings;
public class AddStrings {
    public static void main(String[] args) {
        String s1 = "12";
        String s2 = "3";
        String s = "";
        int i = s1.length()-1, j = s2.length()-1, carry = 0, sum;
        while(i>=0 || j>=0 || carry>=0){
            int num1 = s1.charAt(i--) + '0';
            int num2 = s2.charAt(j--) + '0';
            carry = (num1 + num2) / 10;
            sum = (num1 + num2 + carry) % 10;
            s = s+sum;
        }
        System.out.println();
    }
}
