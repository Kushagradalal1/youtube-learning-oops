package Encapsulation;
class Employee{
    int empId=2;
    int basisSalary=20000;

    int incentive=200;
    void countSalaries(){
        System.out.println(incentive+basisSalary);
    }
}
public class Test {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.countSalaries();
    }
}
