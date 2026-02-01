import java.util.*;

public class revNum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();

        System.out.println("Reversed num = "+rev);

        sc.close();
    }
}
