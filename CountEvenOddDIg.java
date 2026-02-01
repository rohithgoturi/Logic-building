import java.util.Scanner;

public class CountEvenOddDIg {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        while(num>0){
            int rem = num%10;
            num /=10;

            if(rem%2==0){
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("no. of even digits = "+evenCount+"\nno. of odd digits = "+oddCount);
        sc.close();
    }
}
