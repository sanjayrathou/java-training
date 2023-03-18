
// USING STRING BUILDER

public class ReverseString2 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Sanjay");
        int n=sb.length();
        for(int i=0;i<n/2;i++){
            char ch=sb.charAt(i);
            char dh=sb.charAt(n-1-i);
            sb.setCharAt((n-1-i),ch);
            sb.setCharAt(i,dh);
        }
        System.out.println(sb);
    }
}
