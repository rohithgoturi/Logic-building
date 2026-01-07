class evenOdd {
    
     public static void main(String args[]){
        System.out.println(isEven(15));
    }

    static boolean isEven(int n) {
        // code here
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
}
