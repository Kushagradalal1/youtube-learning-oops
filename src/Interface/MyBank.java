package Interface;
interface MyBank {
    //In Interface the method will be by default an abstract :
    // default public : int rollno = 0;
    // protected : error not allowed in interface : int rollno = 0;
    // private : error not allowed in interface : int rollno = 0;
    void write();
    // static method is not allowed in interface :
}

class SBI implements MyBank{
    @Override
    public void write() {
        System.out.println("write the method : ");
    }

    public static void main(String[] args) {
        SBI sbi=new SBI();
        sbi.write();
    }
}

