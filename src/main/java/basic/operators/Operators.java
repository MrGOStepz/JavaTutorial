package basic.operators;

import java.lang.reflect.Array;

public class Operators {
    //    Arithmetic Operators
    //  * : Multiplication
    //  / : Division
    //  % : Modulo
    //  + : Addition
    //  – : Subtraction
    public static void main(String[] args) {
        //Order of operations
        //() % * / + -
        int a = 5;
        int b = 5;
        int c;

        a++;
        ++a;

        c = a + b;
        System.out.println(c);
    }
}
