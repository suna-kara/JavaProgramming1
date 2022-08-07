package week16;

public class Running extends Exercise{
    public Running(double weight) {
        super(weight);
    }

    @Override
    public void perform() {
        System.out.println("Performing Running Exercise On the Track");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return (int) ((int) minutes*13*(weight/100));
    }
    //   public abstract void  run; you can not declare your methods as abstract your calss as abstract





}
