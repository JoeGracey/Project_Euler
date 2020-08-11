public class Main {

    public static void main(String[] args) {
	    /*
            The prime factors of 13195 are 5, 7, 13 and 29

            What is the largest prime factor of the number 600851475143

            Loop through prime checking it with every number
            How do I check it?
            With a for loop?
            How many times do I loop through?
            var for the number I'm checking
            save and display a var for every prime number
	     */


        long prime = 600851475143L;

        for(long i = 0L; i < 10; i++) {
            if(prime % i == 0) {
                System.out.println(prime);
            }
            i++;
        }
    }
}
