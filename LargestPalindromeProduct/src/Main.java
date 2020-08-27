public class Main {
    public static boolean isPalindrome(int number) {
        int reverseNumber = 0;                    // the reversed number
        int x = number;                     // store the default value (it will be changed)
        while (x > 0) {
            reverseNumber = 10 * reverseNumber + x % 10;
            x /= 10;
        }
        return number == reverseNumber;               // returns true if the number is palindrome
    }

    public static void main(String[] args) {
        int max = -1;

        for (int i = 999; i >= 100; i--) {
            if (max >= i * 999) {
                break;
            }
            for (int j = 999; j >= i; j--) {
                int p = i * j;
                if (max < p && isPalindrome(p)) {
                    max = p;
                }
            }
        }
        System.out.println(max > -1? max : "No palindrome found");

    }
}

