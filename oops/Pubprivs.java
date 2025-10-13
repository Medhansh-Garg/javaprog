package oops;

public class Pubprivs {
    public static void main(String[] args) {
        pubpriv p=new pubpriv();
        p.pub=45;
        //p.priv=45;
        p.setPriv(0);
        p.display();
    }
}
