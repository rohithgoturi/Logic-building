import java.util.*;

public class revNum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();

        System.out.println("Reversed num = "+rev);

        sc.close();
    }
}
