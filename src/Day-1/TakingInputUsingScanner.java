import java.util.Scanner;

public class TakingInputUsingScanner {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);  //system.in means taking input from keyboard  and  is passed as a parameter and is used to take input.

        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();

        int c = a+b;

        System.out.println("Total is: " +c);

        //Scanner sc1 = new Scanner(String str);          //  Reading String input:

        //Scanner sc2 = new Scanner(InputStream input);  // Reading input stream:
        //Scanner sc3 = new Scanner(File file);          //  Reading file input


       // ex 2:

        System.out.println("Taking input from user: ");


        //boolean b1 = sc.hasNextInt();    //hasNextInt function check checks wheter enter value is interger or not.
        //System.out.println(b1);

        // ex 3:
        String str = sc.next();
        System.out.println(str);


        //ex 4:

        System.out.println("Enter student name, Roll no, Marks, Grade");

        String name = sc.next();
        int rollNo = sc.nextInt();
        float marks = sc.nextFloat();
        char grade = sc.next().charAt(0);

        System.out.println("****Student Data****");
        System.out.println("Name: "+name);
        System.out.println("Gender: "+rollNo);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+grade);







    }
}
