public class swapString {

    public static void main(String[] args) {

        String a = "sanjay";
        String  pl = " ";
        char ch;

        for(int i=0;i<a.length();i++){

            ch=a.charAt(i);
            pl=ch+pl;

        }

        System.out.println(pl);

    }
}
