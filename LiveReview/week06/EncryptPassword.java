package week06;

public class EncryptPassword {
    public static void main(String[] args) {

        /**
         *
          */

String password="Cydeo";
String encryptWithChar="x";
String encryptedPassword="";

        for (int i = 0; i <password.length()  ; i++) {
          //i stands for index of password string
          encryptedPassword +=""+password.charAt(i)+encryptWithChar;
        }

        System.out.println("encryptedPassword = " + encryptedPassword);


    }
}
