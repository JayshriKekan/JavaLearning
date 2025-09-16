public class TypeCasting {
        public static void main (String [] args) {

        // Type casting is when you assign a value of one primitive data type to another type.
            //In Java, there are two types of casting:
            //Widening Casting (automatically) - converting a smaller type to a larger type size
            //byte -> short -> char -> int -> long -> float -> double
            //Narrowing Casting (manually) - converting a larger type to a smaller size type
            //double -> float -> long -> int -> char -> short -> byte

            // widening casting

            int num1 = 10;
            float num2 = num1;

            System.out.println(num2);

            // Narrowing casting

            float f1 = 42.36f;
            int   i1 =  (int) f1;

            System.out.println(i1);



            //Real life example
            // Set the maximum possible score in the game to 500
            int maxScore = 500;

            // The actual score of the user
            int userScore = 423;

             /* Calculate the percantage of the user's score in relation to the maximum available score. Convert userScore to double to make sure that the division is accurate */
            double percentage = (double) userScore / maxScore * 100.0d;

            // Print the result
            System.out.println("User's percentage is " + percentage);


    }
}
