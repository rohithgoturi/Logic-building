public class fibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms in Fibonacci series
        int a = 0, b = 1;

        System.out.print("Fibonacci Series: " + a + ", " + b);

        for(int i = 2; i < n; i++){
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
        
    }
}
