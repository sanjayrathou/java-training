package Revision;

public class PalindromeNo {
    public static boolean isPalindrome(int n){
        int temp = n;
        int rev  = 0;
        while(temp != 0) {
            int rem = temp % 10;
            temp /= 10;
            rev = rev*10 + rem;
        }
        System.out.println("rev is : " + rev);

        boolean f = (rev == n) ? true : false;
        return f;
    }

    public static void main(String[] args) {
        System.out.println(PalindromeNo.isPalindrome(192));
    }
}
