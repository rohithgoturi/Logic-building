public class swapping2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        // logic building
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = "+ a + ", b = "+b);
    }
}
