package oops;

public class Persons {
    public static void main(String[] args) {
        Person p=new Person();
        System.out.println(p);
        p.age=23;
        //p.address=123; // error because address is private
        p.setAddress(123);
        p.displayAddress();
        System.out.println("age"+p.age);

    }
    
    
}
