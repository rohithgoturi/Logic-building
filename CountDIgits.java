import java.util.Scanner;

public class CountDIgits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;
        int org_num = num;

        while(num>0){
            num /= 10;
            count++;
        }

        System.out.println(count + " no. of digits are present in "+ org_num);
        sc.close();
    }
}
