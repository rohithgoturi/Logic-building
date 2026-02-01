public class revStr1 {
    public static void main(String[] args) {
        String name = "Rohith";
        String rev = "";

        int len = name.length();
        for(int i = len-1; i >= 0; i--){
            rev = rev + name.charAt(i);
        }

        System.out.println("revered string : "+ rev);
    }
}
