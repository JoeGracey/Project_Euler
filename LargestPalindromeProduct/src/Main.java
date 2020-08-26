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

        public static void Run() {

            int maxPalindrome = 0;

            int i = 0;
            int j = 0;

            for(i = 999; i > 99; i--) {
                for(j = 999; j >= i; j--) {
                    int product = i * j;

                    if(isPalindrome(product)) {
                        maxPalindrome = product;
                        String text = "Largest palindrome is: %s x %s = %s";
                        System.out.printf(text, i, j, maxPalindrome);

                        break;
                    }
                }

                if(maxPalindrome != 0) {
                    break;
                }
            }


        }

        static boolean isPalindrome(int number) {
            int numberAux = number;
            int reversedNumber = 0;

            while(numberAux > 0) {
                int rightDigit = numberAux % 10;
                reversedNumber = reversedNumber * 10 + rightDigit;
                numberAux = numberAux / 10;
            }

            return number == reversedNumber;

        }

    }
}

