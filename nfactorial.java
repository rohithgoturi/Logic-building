import java.util.*;

public class nfactorial {

    // Function to calculate factorial of a number.
    public static int factorial(int n) {
        // code here
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(factorial(n));
        sc.close();
    }

}
