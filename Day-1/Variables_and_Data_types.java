import java.util.ArrayList;

public class Variables_and_Data_types {
//primitive data types (8):   byte, short, int, long, float,double, char, string, boolean.
// non-primitive data types/derived datatype:
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 8;
        int num3 = 10;
        int sum = num1 + num2 + num3;

        System.out.println("sum of three nums: "+sum);

        float f1= 12.22f;
        float f2 = 4.56f;
        System.out.println("Subtraction of two nums: "  +(f1-f2));

        //literals: constant value which can be assign to the variable.
        byte age = 34;
        System.out.println(age);

        char ch ='A';
        float ft = 52.6f;
        double d1= 4.618;    // D or d at end not neccesary.
        long l1 = 8555557777L;  //without L or l is consider as integer
        boolean bl= true;
        String str = "Jayshri";

        System.out.println(str);


        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        //Constants:  A variable declared with final becomes a constant, which means unchangeable and read-only:
        //You should declare variables as final when their values should never change. For example, the number of minutes in an hour, or your birth year:

        final int myNum = 15;
        //myNum = 20;    //This line shows error beacause myNum is already declared.

        final String lang = "java";
        final String lang1 = "c";


        //The general rules for naming variables are:

        //Names can contain letters, digits, underscores, and dollar signs
        //Names must begin with a letter
        //Names should start with a lowercase letter, and cannot contain whitespace
        //Names can also begin with $ and _
        //Names are case-sensitive ("myVar" and "myvar" are different variables)
        //Reserved words (like Java keywords, such as int or boolean) cannot be used as names

        //Real life example   student data
        String studName = "Jayshri Kekan";
        int studAge = 24;
        float studMarks= 85.22f;
        long studId = 124568l;
        char grade = 'B';

        System.out.println("Student Name: " +studName);
        System.out.println("Student Age: " +studAge);
        System.out.println("Student Marks: " +studMarks);
        System.out.println("Student ID: " +studId);
        System.out.println("Grade: " +grade);


        // Non-Primitive Data Types:  non-primitive data types are called reference types because they refer to objects.
        // Non-primitive types can be used to call methods to perform certain operations.

        //var Keyword
        //The var keyword was introduced in Java 10 (released in 2018).
        //1. var only works when you assign a value at the same time (you can't declare var x; without assigning a value).


        var x = 10;            // int
        var myDouble = 9.98;   // double
        var myChar = 'D';      // char
        var myBoolean = true;  // boolean
        var myString = "Hello"; // String
        System.out.println(x);


        var y = 5;  // x is now an int
        y = 10;     // OK - still an int
        //y = 9.99;   // Error - can't assign a double to an int

        // But for more complex types, such as ArrayList or HashMap, var can make the code shorter and easier to read:

        // Without var
        //ArrayList<String> cars = new ArrayList<String>();

        // with var
        var cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);






    }
}
