package methods;

public class Dis {
    void display(int a){
        System.out.println(a);
    }
    void display(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        Dis d=new Dis();
        d.display(5);
        d.display("hello");
    }
}
