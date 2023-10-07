public class MaxProduct {



    public static void main(String[] args) {
        int n = 3;
        int q = n / 3;
        int r = n % 3;
        if(n == 2 || n == 3){
            System.out.println(n-1);

        }
        if(r == 0){
           int ans = (int)Math.pow(3,q);
            System.out.println(ans);
        }
        else if (r == 1) {
            int ans = (int)Math.pow(3,q-1);
            System.out.println(ans*4);
        }else{
            int ans = (int)Math.pow(3,q);
            System.out.println(ans*2);
        }
    }
}
