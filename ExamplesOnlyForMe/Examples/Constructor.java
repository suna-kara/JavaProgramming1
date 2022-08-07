package Examples;

public class Constructor {
    public Constructor(){
        System.out.println("A ");

    }
    public Constructor(int a){
     this(2.5);
        System.out.println("B ");
    }
    public Constructor(double c){
        this();
        System.out.println("C ");
    }

    public static void main(String[] args) {
         Constructor cnr=new Constructor(100);
    }










}
