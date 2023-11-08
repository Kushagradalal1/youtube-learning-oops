package Encapsulation;
class Employee{
    private int empId;
    private int basisSalary;

    private int incentive;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getBasisSalary() {
        return basisSalary;
    }

    public void setBasisSalary(int basisSalary) {
        this.basisSalary = basisSalary;
    }

    public int getIncentive() {
        return incentive;
    }

    public void setIncentive(int incentive) {
        this.incentive = incentive;
    }

    void countSalaries(){
        System.out.println(incentive+basisSalary);
    }

}
public class Test {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setEmpId(101);
        emp.setIncentive(100);
        emp.setBasisSalary(20000);
        emp.countSalaries();
    }
}
