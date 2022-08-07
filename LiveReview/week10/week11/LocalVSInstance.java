package week10.week11;

public class LocalVSInstance {

    public  int a=4;// initialized value


    public  void showDifferance(int number){     // Ques= I want to be able to change this a as well
        int a=number;  // this is a local to the method
        System.out.println(a);

    }

    public static void main(String[] args) {
        LocalVSInstance obj= new LocalVSInstance();
        System.out.println("------coming from method--------");
        obj.showDifferance(8);

        System.out.println("------coming from instance variable--------");
        System.out.println(obj.a);

        obj.a=1;
        System.out.println(obj.a);
    }
}
