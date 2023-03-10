
public class Array {
    public static void main(String[] args) {
        arr();
    }
    static void arr(){
        int[] marks={96,97,98,99}; // int marks[]=new int[4]
        marks[0]=96;
        marks[1]=98;
        marks[2]=97;
        System.out.println(marks); //it will print garbage value
        System.out.println(marks.length);

    }



}
