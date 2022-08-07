package day24_Arrays;

import java.util.Arrays;

public class testUnit2Quest {

    public static void main(String[] args) {
        int count=0;
        for (int a = 0; a < 4; a++) {
            if (a==3) continue;;
            for (int b = a+1; b <5 ; b++) {
                count++;
                if (b==3) break;
            }
        }
        System.out.println(count);


        double[] doub=new double[4];
        doub [0]=1.0;
        doub[2]=42.1;
        doub=new double[4];
        doub[1]=17.2;
        doub[3]= doub.length;
        System.out.println(Arrays.toString(doub));

        String[] strs={"display","population","meeting","copy","franchise"};
        int a= strs.length;;

        System.out.println(a+ " +b");



        byte[] b=new byte[5];
        for (int i = 0; i < b.length; i++) {
            b[i]=(byte)(b[i] *2);


        }
        System.out.println(b);



        String [] words={"one","two","three","four"};
        String[] other=new String[words.length];

        int index=0;
        for (String word : words) {
            other[index++]=word+word.length();

        }
        System.out.println(Arrays.toString(other));


        int nums[]={14,1,84,97,1243,46};
        int total=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] %2!=0){
                total +=3;
            }else{
                total+=10;
            }
            if (i%3 ==0){
                total -=15;
            }
        }
        System.out.println(total);
    }
}
