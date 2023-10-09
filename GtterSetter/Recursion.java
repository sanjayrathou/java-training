package GtterSetter;

public class Recursion {
    static int getResult(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;

        int ans = getResult(n-1) + getResult(n-2);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getResult(2));
    }
}
