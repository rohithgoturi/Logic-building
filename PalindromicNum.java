import java.util.Scanner;

public class PalindromicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int orgNum = num;
        int rev = 0;
        while(num!=0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        if(orgNum == rev){
            System.out.println(orgNum+" is a palindromic number");
        }
        else{
            System.out.println(orgNum+ " is not a palindromic number");
        }

        sc.close();
    }
}
