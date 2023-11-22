package Oops;

public class OopsExplain {
    /*

    : Why we need oops ?
    : oops is a concept :

    : reuse the code :
    : Object oriented programming : Object & classes :
    : Object Example : Scanner sc=new Scanner(System.in) : import java.util.Scanner
    : Class Concept :
    : Object--> Class--> Interface=-> package :


importance : interview point of view :
    : Four Pillars : encapsulation, abstraction, inheritance & polymorphism :

    : Object?? : real life entity : physical entity.
    : Classes?? : virtual entity : classes are called the category : logical entity.

    : we are creating the classes on the basis of an Objects.
    : we are creating a class with the help of class keyword.
    : In class we have data-members and member-functions() :
    : this process is called as encapsulation : wrapping of a data-members and members function into a single unit is called as encapsulation.


    : Pillar 1 : Encapsulation (data hiding): variables + methods : it's also used for the security purpose.
    : we can achieve the encapsulation using getter and setter method() :


    Note* new keyword is used for memory allocation : Object will hold your memory :


    : class_name object_name=new class_constructor() :

    : Non-static : every objects is having its own copy for all non-static variable : That's why every non-static variable has a instance variable.
      (because every instance is having there own copy).

    : Static : there will be a single copy for all the static variables and that copy will be shared by all the objects.
      For all the entire class having a single copy.
      Only one copy for class that's why its called as class variable.

    Note* without the main() method java program can't be run : why? : because main method is the entry point of the java program :
    Note* without static keyword also main method will not be run :

    : Access Modifier :
    Modifier        class       packages       subclasses      global
    public          yes         yes            yes             yes
    protected       yes         yes            yes             no
    Default         yes         yes            no              no
    private         yes         no             no              no

    : packages : when we are trying to make a same class name : can we do this? : answer is no we can't do this :
    : packages : we can make a same class name but it should be in a different packages if should not be in same package :

    : if we want to used the class then we need to import the package.


    : Pillar 2 : Abstraction : (Function Hiding) : background implementation details hiding.
    : Abstraction can be achieve in two ways : abstract (class) & interface (blueprint) :
    : we can achieve the abstraction 100% using the Interface :
    : When we create a class and if we declared that class as an Abstract : we can't create an Object of that class :
    : In abstact we can have final and non-final & static and non-static variables.
    : you may known the difference like...

      Abstract classes may contain abstract methods, but concrete classes can’t.

      Abstract classes usually have partial or no implementation. On the other hand, concrete classes always have full implementation of its behavior.

      Unlike concrete classes, abstract classes cannot be instantiated. Therefore abstract classes have to be extended in order to make them useful.

    : Interface : Interface is a contract that defines that what a class should have.
        Interfaces are likes abstract classes
        Interfaces are used for creating the specification of a class.

    : In Interface : 1) for data-members of an interface is public by default, private and protected.
                     2) for member-functions of an interface is public and abstract : we can't make it protected and private.
                     3) we cannot create an Object for an interface : but we can create a reference for an Interface.



    : Pillar 3 : Inheritance : concept of super class and sub class : parent class, base class, super class : derived class, child class, subclass :

    : inheritance means a reusability.
    : A new class can be reuse the properties of an existing class.


    : Types of Inheritance :
    1) single level inheritance :
    2) multi level inheritance :
    3) multiple level inheritance : not possible in java. {Java interfaces}
    4) Hierarchical level inheritance :

    : Pillar 4 : Polymorphism : poly : many & morphism : forms :
    : see the implementation of oops :

    : Two types of polymorphism :
    : 1) Method Overloading 2) Method Overriding
    : Two achieve the polymorphism : we have Compile time polymorphism and run-time polymorphism

    : Compile time : Overloading : RunTime : Overriding :
    : Operator Overloading is not allowed in java : learn this concept in depth please why its not allowed in java.

    : Overloading : methods name same but diff parameters ; with in class :
    : Overriding : method name same and parameter is also same : but not with in the same class :
    :


     */
}
