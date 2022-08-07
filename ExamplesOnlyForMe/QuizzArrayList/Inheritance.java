package QuizzArrayList;

/* class Inheritance {
    private void init(){
        System.out.println("Initialized");
    }
    private void  start(){
        init();
        System.out.println("Srated");
    }
}
*/

class test1{
    protected  void method(){
        System.out.println("A");
    }
    private void  method(int a){
        System.out.println("B");
    }
    public static class  test2 extends test1
    {

        public void method(int a) {
            System.out.println("C");
        }


    }
    public static void main(String[] args) {
        test2 obj=new test2();
        obj.method();
    }
}
