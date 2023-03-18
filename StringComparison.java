
//    NOTE - STRINGS ARE IMMUTABLE

public class StringComparison {
    public static void main(String[] args) {
        String name1="Tony Stark", name2="Sony";

        if(name1.compareTo(name2)==0){          // comparison
            System.out.println("equal");
        }else{

            System.out.println("not equal");
        }
        String subString=name1.substring(2,9);       // excluding the 9th index
        System.out.println(subString);

    }
}
