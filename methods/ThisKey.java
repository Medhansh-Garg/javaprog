package methods;

public class ThisKey {
    int id;
    void setId(int id){
        this.id=id;

        }

    void displayId(){
        System.out.println("id="+id);
    }
    public static void main(String[] args) {
        ThisKey t=new ThisKey();
        t.id=5;
        t.setId(4);
        t.displayId();
    }
    
}
