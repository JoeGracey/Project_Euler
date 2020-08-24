public class Main {

    public static void main(String[] args) {

        /* Palindromic number reads the same both ways
           largest two 2-digit number is 9009 = 91 * 99
           Find the largest two 3-digit numbers
           Create a loop that multiplies two numbers together
           If it's a 5-digit number, check that the numbers in index 0 and 4 are the same and index
           1 and 3 are the same.
           If it's a 6-digit number, check index 0/5, 1/4, and 2/3 are the same. */

        /* Use an array for the number.
           create two variables and multiply them.
           Multiply them using two for loops
           Compare the int and the reversed int
           if they match print out the result
           check if there is a larger number */

        /* Instructions on reversing an int:
           1. Extract off the rightmost digit. (1234 % 10) = 4
           2. Take that digit (4) and add it into a new reversedNum.
           3. Multiply reversedNum by 10 (4 * 10) = 40, this exposes a (0) to the right of (4).
           4. Divide the input by 10, (removing the rightmost digit). (1234 / 10) = 123
           5. Repeat at step 1 with 123. */

        /* Not sure where in the scope to use these variables: */
           int modulusOfPalindromicNum;
           int reversedPalindromicNum;
           int palindromicNum;

        // Multiplying the two 3-digit numbers
        for (int i = 9; i > 2; i--) {
            for (int k = 9; k > 2; k--) {
                reversedPalindromicNum = 0;
                palindromicNum = i * k;

                System.out.println("palindromicNum: " + palindromicNum);

                // Extract off rightmost digit
                modulusOfPalindromicNum = palindromicNum % 10;
                System.out.println("modulusOfPalindromicNum: " + modulusOfPalindromicNum);

                // Take that digit and add it to a new variable
                reversedPalindromicNum += modulusOfPalindromicNum;
                System.out.println("reversedPalindromicNum: " + reversedPalindromicNum);

                // Multiply new variable by 10
                reversedPalindromicNum *= 10;
                System.out.println("reversedPalindromicNum: " + reversedPalindromicNum);

                // Divide original variable by 10
                palindromicNum /= 10;
                System.out.println("palindromicNum: " + palindromicNum);
                System.out.println("----------------------------------------------");
            }
        }



//        public static int createPalindrome() {
//            for(int i = 999; i > 100; i--) {
//                for(int j = 999; j > 100; j--) {
//                    int prod = i*j;
//                    String s = Integer.toString(prod);
//                    String s2 = new StringBuffer(s).reverse().toString();
//                    if(s.equals(s2)) {
//                        return prod;
//                    }
//                }
//            }
//            return 0;
//        }
//
//        public static void main(String[] args){
//            int answer = createPalindrome();
//            System.out.println(answer);
//        }
    }
}

