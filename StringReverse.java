public class StringReverse {
    public static void main(String[] args) {
        String a="sanjay", nste=" ";
        char ch;
        for(int i =0; i<a.length(); i++){
            ch = a.charAt(i);
            nste = ch+nste;
        }
        System.out.println("Your reverse string  "  +nste);





    }
}
