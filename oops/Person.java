package oops;

public class Person {
    private int address;
    public int age;
    void setAddress(int a){
        address=a;
    }
    void displayAddress(){
        System.out.println("address="+address);

    }
    public static void main(String[] args) {
        Person p=new Person();
        p.address=123;
        p.age=23;
        p.displayAddress();
        System.out.println("age="+p.age);
    }
}
