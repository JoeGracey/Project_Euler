public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        create var = sum
        increment to 1, 2, 3.. to 10
        divided by 3 evenly
        divided by 5 evenly
        if divided evenly, add those numbers together

         */
        int sum = 0;

        for(int i = 1; i < 1000; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                sum += i;
                System.out.println("Sum: " + sum + " i: " + i);
            }
        }
    }
}
