package methods;

public class Circle {
    int radius;
    
    int area(){

        
        return (int)(3.14*radius*radius);
    }
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.radius=5;
        System.out.println("area:"+c1.area());
        Circle c2=new Circle();
        c2.radius=10;
        System.out.println("area:"+c2.area());
    }
}

