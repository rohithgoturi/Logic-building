import java.util.Scanner;

public class nRecursion {
    public static void printNos(int n) {
        // Code here
        if(n==0){
            return;
        }
        printNos(n-1);
        System.out.println(n);
    }
    
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        printNos(n);
        sc.close();
    }

}
