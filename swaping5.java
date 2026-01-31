public class swaping5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swaping a = "+ a + ", b = "+ b);

        b=a+b-(a=b);
        System.out.println("After swaping a = "+ a + ", b = "+b);
    }
}
