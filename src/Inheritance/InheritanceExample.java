package Inheritance;
class parent{
    void m1(){
        System.out.println("hello from m1");
    }
    void m2() {
        System.out.println("hello from m2");
    }
}
class child extends parent {
    void m3(){
        System.out.println("hello from m3");
    }
    void m4(){
        System.out.println("hello from m4");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        child child=new child();
        child.m1();
        child.m2();
        child.m3();
        child.m4();
    }
}
