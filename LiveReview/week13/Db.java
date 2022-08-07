package week13;

public class Db {

    private String data;
    private int yint;

    private void İnsertData(String data,int i){
        setData(data); // we use this keyword only if our instance variable has same name with local variable(both of them 'data')
         setYint(i);
       // yint=i;

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getYint() {
        return yint;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }
}
