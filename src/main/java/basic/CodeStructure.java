package basic;

public class CodeStructure {
    public static void main(String[] args) {
        // "public" access modifier; allows user to access the class outside the package
        // "class" keyword is used to define a class name must be same as the file name
        // "{ }" curly braces are used to define the class body
        // "public static void main(String[] args)" is the main method
        //

        // Java is case-sensitive

        //Class body block of code { }
        //Object
        //Method
        //Parameter
        //Local Variable
        //Field
        //Constructor
        //Method Body

        boolean isAlien = false;
        //Equality Operator
        if (isAlien == true)
            System.out.println("You are an alien");
       // Operator
       // ==, != , >, <, >=, <=, !, &&, ||. &. |
        if (isAlien == true) {
            System.out.println("You are an alien");
        } else {
            System.out.println("You are not an alien");
        }

        int age = 10;
        if ((age >= 18) && (age <= 100)) {
            System.out.println("You can vote");
        }

        //Switch Statement
        int month = 1;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
        }

        //The ternary operator
        int result = isAlien ? 1 : 0;
        String s = isAlien ? "You are an alien" : "You are not an alien";

        // Java Operators Precedence Table
        double myFirstValue = 10.0;
        double mySecondValue = 20.0;
        double myValueTotal = (myFirstValue + mySecondValue) * 10;

        // Java Statement
        //
    }
}
