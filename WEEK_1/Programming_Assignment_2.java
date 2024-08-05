import java.util.Scanner;
public class Programming_Assignment_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to input an integer
        //System.out.print("Input an integer: ");

        // Read the integer from the user
        long n = input.nextLong();

        // Calculate and display the sum of the digits
        System.out.print("The sum of the digits is: " + sumDigits(n));
    }
    // Calculate the sum of the digits by defining a sumDigits() function
    // This should return the sum
	public static int sumDigits(long n) {
        int sum = 0;
        while(n!=0) {
            sum += n % 10;
            n /= 10;
            }
    return sum;
    
  }
}