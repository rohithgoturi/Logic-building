public class revStr3 {
    public static void main(String[] args) {
        String name = "rohith";
        

        StringBuffer sb = new StringBuffer(name);
        StringBuffer rev = sb.reverse();

        System.out.println("reversed string = "+rev);
    }
}
