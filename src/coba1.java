public class coba1 {
    public static void main(String[] args) {
        int num1= 2;
        int num2= num1*2;
        for(int i=0; i<=num1; i++) {
            for(int j=0; j<=num2; j++) {
                if(i == num1/2 && j == num2/2){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
