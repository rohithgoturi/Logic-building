import java.util.Scanner;

public class PalindromicStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String rev = "";
        int len = name.length();

        for(int i = len-1; i >= 0; i--){
            rev = rev + name.charAt(i);
        }

        if(name.equals(rev)){
            System.out.println(name+" is palindromic string");
        } else {
            System.out.println(name+" is not a palindromic string");
        }

        sc.close();
    }
}
