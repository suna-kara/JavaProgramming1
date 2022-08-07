package day28_ArrayList;

public class _2_StrongPassword2 {
    public static void main(String[] args) {

        String password = "WoodenSpoon123!";

        int countUppercase = 0;
        int countLowercase = 0;
        int countDigits = 0;
        int countSpecialChar = 0;


        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);


            if (Character.isUpperCase(each)) {
                countUppercase++;
            } else if (Character.isLowerCase(each)) {
                countLowercase++;
            } else if (Character.isDigit(each)) {

                countDigits++;


            } else {
                countSpecialChar++;
            }
        }
/*
            System.out.println("countLowercase = " + countLowercase);
            System.out.println("countUppercase = " + countUppercase);
            System.out.println("countSpecialChar = " + countSpecialChar);
            System.out.println("countDigits = " + countDigits);
*/

            boolean hasUpperCase=countUppercase>0;
            boolean hasLowerCase=countLowercase>0;
            boolean hasDigit=countDigits>0;
            boolean hasSpecialCase=countSpecialChar >0;

         /*   boolean StrongPassword=password.length() >=8 && !password.contains(" ")
                    && hasSpecialCase && hasDigit && hasLowerCase && hasUpperCase;*/

        boolean strongPassword=false;
        if (password.length() >=8){
            if (!password.contains(" ")){
                if (hasUpperCase){
                    if (hasDigit){
                        if (hasSpecialCase){
                            if (hasLowerCase){
                                strongPassword=true;
                            }
                        }
                    }
                }
            }
        }


                 System.out.println("StrongPassword = " +strongPassword);







        }
    }

