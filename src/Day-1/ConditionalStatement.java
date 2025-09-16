public class ConditionalStatement {
    public static void main (String [] args){
    // Decision-making involves evaluating a condition to a Boolean value and making a decision based on it. The basic idea revolves around executing the block of code whose condition evaluates to true. Below are the types of decision-making statements:
    //if statement
    //if...else statement
    //if...else if statement
    //nested if statements
    //switch statement

        //eg 1:  if stmt
         int a = 5;
         if (a == 5) {
             System.out.println("True");
         }

         boolean ab = false;

         if ( ab != true) {
             System.out.println("True");
         }

         if (6 > 3) {
             System.out.println("6 is greater than 3");
         }

         int x = 10;
         int y = 5;
         if (y < x) {
             System.out.println("y is less than x");
         }

    // eg 2: if...else stmt
        if ( x > y ) {
            System.out.println("X is greater than y");
        } else {
            System.out.println("x is not greater than y");
        }

        String name = "Jayshri";
        if(name.equals("Jayshree")) {
            System.out.println("valid name");
        } else {
            System.out.println("Invalid name");
        }

    //eg 3:  if....else if stmt

        String student[] = {"jay","Rocky","Jhon"};
        int id[]  = {1,2,3};

        if(student[0] == "jay" && id[1] == 1) {
            System.out.println("Details of jay");
        } else if(student[1] == "Ram" && id[1] == 2) {
            System.out.println("Details of Rocky");
        } else if (student[2] == "Jhon" && id[2] == 3) {
            System.out.println("Details of Jhon");
        } else {
            System.out.println("Invalid data");
        }

    // eg 4: nested if..else
        int marks = 84;
        if(name.equals("Jayshri")){
            if(marks > 90) {
                System.out.println("First Rank: "+name );
            } else {
                System.out.println("Not a first rank!");
            }
        }
    //  eg 5:  if else with opeartors
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3; // 1 = highest

        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

    // **** switch case
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
