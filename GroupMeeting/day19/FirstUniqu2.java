package day19;

public class FirstUniqu2 {
    public static void main(String[] args) {
        String str="Wooden Spoon";
        str=str.replaceAll(" ","");
        int fre=0;
        String result="";

        for (int i = 0; i < str.length(); i++) {

            char ch=str.charAt(i);

            if (str.indexOf(ch)== str.lastIndexOf(ch)){

                result+=ch;
            }

        }
        System.out.println(result);
    }
}
