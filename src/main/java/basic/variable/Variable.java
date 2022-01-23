package basic.variable;

import java.lang.reflect.Array;

//Reference https://www.geeksforgeeks.org/introduction-to-java/?ref=lbp
//Name convention https://en.wikipedia.org/wiki/Naming_convention_(programming)#Java

//Name convention camelCase
//class Tutorial noun
//function verb
//variable noun
public class Variable {
    //Static Variable
    static String staticValue = "Static Value";
    //Instance Variable
    int number = 0;

    //Scope of Variable
    //public
    //protected
    //default
    //private

    public static void main(String[] args) {
        //Primitive Data Type
        short sNumber = 0;
        int number = 0;
        long lLong = 0L;
        byte b = 1;
        char character = 'A';
        float floating = 0.0F;
        double doubleType = 0.0d;
        boolean bool = true;

        //Non-Primitive Data Type or Object Data type
        String string = "Example";
        Array array;

        //Local Variables+
        int localVariable = 0;
        System.out.println();
    }
}
