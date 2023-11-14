package Polymorphism;
class Features{
    //Method Overloading : same method with diff parameters :
    static void add(int a, int b){
        System.out.println(a+b);
    }
    //method overloading :
    static void add(double a, double b){
        System.out.println(a+b);
    }
}
public class Calculator {
    public static void main(String[] args) {
        Features.add(2,3);
        Features.add(2.2,2.3);
    }
}
