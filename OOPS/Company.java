package OOPS;

// ENCAPSULATION

class Employee{

    private int empId;      // DATA HfbgfhtIDING
    public void setEmpId(int emp_id){
        empId = emp_id;
    }

    public  int getEmpId(){
        return empId;
    }
}

public class Company {

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.setEmpId(88);
        System.out.println(obj.getEmpId());
    }

}
