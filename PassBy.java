package college;
public class PassBy {

    static int add (int x,int y){

        return x+y;

    }

    static int test(int a){

        a++;
        return a;

    }
    
    public static void main(String[] args) {

        add(7,9);
        
        int a = 1;
        String s = "abc";
        System.out.println(a);
        System.out.println(test(a));
        System.out.println(a);
        System.out.println(s);


    }

}
