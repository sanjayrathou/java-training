public class array {
    public static void main(String[] args) {
    //Type 1:
    int [] marks;
    marks = new int[5];
    marks[0]=100;
    marks[1]=45;
    marks[2]=56;
    marks[3]=78;
    marks[4]=34;
    System.out.println(marks[3]);

    //Type 2:
    int[] marks1 = new int[5];
    marks1[0]=100;
    marks1[1]=45;
    marks1[2]=56;
    marks1[3]=78;
    marks1[4]=34;
    System.out.println(marks[0]);

    //Type 3:
    int[] marks2 = {78,89,45,69,56};
    System.out.println(marks2[4]);


    String[] cars = {"bugati","bmw","volvo","volkeswagon"};
    for (String i:cars){
        System.out.println(i);
    }
}
}

