package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifier_Test4 extends ProtectedAccessModifier {
    public static void main(String[] args) {
       // System.out.println(AccessModifier_Test4.name);
        System.out.println(AccessModifier_Test4.name2); // protected is visible outside package

      // AccessModifier_Test4.method1(); // default access modifier is not visible here
       AccessModifier_Test4.method2();

    }
}
