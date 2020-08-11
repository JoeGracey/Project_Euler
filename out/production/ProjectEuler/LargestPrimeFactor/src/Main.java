public class Main {

    public static void main(String[] args) {
	    /*
	        Prime number is divisible by only 1 and itself

            The prime factors of 13195 are 5, 7, 13 and 29

            What is the largest prime factor of the number 600851475143

            Loop through num checking it with every number
            How do I check it?
            With a for loop?
            How many times do I loop through?
            create var for the num I'm checking
            save and display a variable for every prime number
	     */

        long num = 600851475143L;
        boolean flag = false;

        for(long i = 2L; i <= num / 2; ++i) {
            if(num % i == 0) {
                flag = true;
                break;
            }
        }

        if(!flag) {
            System.out.println(num);
        } else {
            System.out.println("X");
        }
    }

    /*
        I did not write this on my own. I looked it up and I'm trying to understand it.
     */
}


