public class revStr2 {
    public static void main(String[] args) {
        String name = "Rohith";
        String rev = "";

        char nameArr[] = name.toCharArray();
        int len = nameArr.length;

        for(int i = len - 1; i>=0; i--){
            rev = rev + nameArr[i];
        }

        System.out.println("reversed String : "+rev);
    }
}
