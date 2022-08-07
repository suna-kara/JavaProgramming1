package day24_Arrays;

public class Array6 {
    public static void main(String[] args) {
        String str="ABCDEhıjkl456879!'^%&/()=?*";
        char[] chars=str.toCharArray();

        String upperLetters="";
        String lowerLetters="";
        String digits="";
        String spech="";
        for (char each : chars) {
            if (Character.isLetter(each)){
                if (Character.isUpperCase(each)){
                    upperLetters +=each;

                }else{
                    lowerLetters +=each;
                }

            }else if (Character.isDigit(each)){
                digits +=each;
            }else{
                spech +=each;
            }
        }
        System.out.println("spech = " + spech);
        System.out.println("digits = " + digits);
        System.out.println("lowerLetters = " + lowerLetters);
        System.out.println("upperLetters = " + upperLetters);

    }
}
