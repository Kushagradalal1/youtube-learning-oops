package Abstraction;

public abstract class Bank {
    //we can write the data-members and member function into a abstract class : but member functions implementation can be written into a function itself.
    String name;
    abstract void readData();
    //In Abstraction we can write a static method :
    static void calling() {

    }
}

class Admin extends Bank {
    @Override
    void readData() {
        System.out.println("reading data");
    }
}