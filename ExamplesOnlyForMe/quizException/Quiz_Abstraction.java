package quizException;

public class Quiz_Abstraction {
    interface  A{
        void readBook();
        abstract  void watchTV();
    }
    abstract  class  B implements  A{
        public void readBook(){
            System.out.println("reading book");
        }
    }
    public class  C extends  B{
        public void readBook(){
            System.out.println("raeding");
        }

        @Override
        public void watchTV() {

        }

    }
}
