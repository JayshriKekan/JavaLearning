public class Looping {
    public static void main(String[] args) {

        // for loop  syntax
        //for (initializeVariable; testCondition; increment/decrement) {
            // block of code
        //}
        //eg 1
        for(int i=0; i <=5; i++) {
            System.out.println("value of i: "+i);
        }

        //eg 2: sum of number using for loop
            int total = 0;
            for(int i=1 ; i<=5; i++ ) {
                total = total + i;
            }
            System.out.println("Total is: " +total);

        //  prime number:    a special syntax for iterating through arrays and other collection objects, also called a for-each loop.
            int prime[] = {1,2,3,4,5,6,7,8,9,10};
            System.out.println("prime numbers are:");
            for(int i: prime) {
                System.out.println(i);
            }

        // while loop
        //while (baseBooleanCondition) {
            // block of code
        //}

        // ex: 1
        System.out.println("While loop examples:");
        int num = 4;
            while (num >= 1) {
                System.out.println(num);
                num--;
            }

        //do...while() loop
        //do {
        //    //block of code
        //} while (baseBooleanCondition);

        //ex: 2
        int i = 4;
        System.out.println("do..while loop example");
        do {
            System.out.println(i);
            i--;
        } while(i > 0);
    }
}
