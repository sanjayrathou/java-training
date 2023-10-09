package GtterSetter;

import OOPS.ProtectedAcess;

public class StudentClass {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "raghav";
        s.percent = 92.7;
  //      s.rno = 9;            IT CAN'T BE ACCESSED BCOZ IT IS PRIVATE VARIABLE.

  //      System.out.println(s.getRno());

        s.setRno(9);      // WE CAN CHANGE(SET) THE VALUE OF rno = 9 in class Student USING SETTER METHOD.

        System.out.println(s.getRno());

        System.out.println(s.schoolName);

    }
}
