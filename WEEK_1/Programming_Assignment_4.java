import java.util.Scanner;

public class Programming_Assignment_4 {

  public static void main(String[] args)

  {
    int i, j, n, k = 1;

    //System.out.print("Input number of rows : ");

    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    //use nested for loop for printing pattern like a right angle triangle with the number increased by 1.//use nested for loop for printing pattern like a right angle triangle with the number increased by 1.
    for ( i = 1; i <= n ; i++ ) {
        for ( j = 1; j <= i ; j++ ) {
            System.out.printf("%d", k);
            if (j < i)
                System.out.printf(" ");
            else 
                System.out.printf("");
            k ++;
        }
    
        if (i < n)
            System.out.printf(" \n");
        else 
            System.out.printf("");
    }
  }
}