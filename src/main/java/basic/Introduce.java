package basic;

import java.math.BigDecimal;

public class Introduce {
    public static void main(String[] args) {
        //Variable
        //Primitive Data Type
        //1. Whole Number
        //2. Real Number
        //3. Character
        //4. Boolean

        // Whole Number Data Types
        byte b = 1;
        short sNumber = 0;
        int number = 0;
        //You can use _ to separate the number
        int thousand = 1_000;
        //Using l or L to indicate long
        long lLong = 0L;

        //Real Number Data Types
        //Floating-point Number Data Types
        float floating = 0.0f;
        double doubleType = 0.0d;

        //Character Data Type
        // 1 Character ''
        //stmbl.cc
        // Unicode -table
        char uniCode = '\u0041';
        // Literal Character
        char character = 'A';
        // Integer Value
        char myChar = 65;
        // String ""
        String emptyString = "Many Character";

        //Boolean Data Type
        boolean bool = true;
        //Prefix is,has for Boolean
        boolean isTrue = Boolean.TRUE;
        boolean hasValue = true;


        //Build-in Class
        // Wrappers (Boolean,Byte,Character,Double,Float,Integer,Long,Short)
        // For Example
        BigDecimal bigDecimal = new BigDecimal(100);
        //String using ""
        String string = "Example";

        // Concatenate String
        int myInt = 10;
        String myString = "My Int is " + myInt;

        // Strings are immutable
        // Old will get discarded from memory automatically
        // Then Save a new one to memory
        // using String Builder Class because StringBuilder is mutable
        // String class is in a special category in Java
        // String can use like a primitive data type

        // Operands
        // + Addition
        // - Subtraction
        // * Multiplication
        // / Division
        // % Remainder
        // ++ Increment Post-fix, ++ Increment Pre-fix
        // -- Decrement Post-fix, -- Decrement Pre-fix
        char fistChar = 'A'; char secondChar = 'B';
        System.out.print(fistChar + secondChar); // 131
        System.out.print("" + fistChar + secondChar); // AB

        int result = 0;
        result = result + 1;
        result += 1;
        result++;
        ++result;

        //For more inforation
        // x-=y
        // is really x = (data type of x) (x-y)

        // Comment in Java
        // Single Line Comment //
        // Multi Line Comment /* */
    }
}
