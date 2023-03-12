public class PassByValue {
    static void decrease(int p,int q){
        p--;
        q=q-2;
      //  System.out.println(p+q);
    }
    public static void main(String[] args) {
        int p=26;
        int q=13;
        decrease(p,q);
       System.out.println(p+q);
    }
}
