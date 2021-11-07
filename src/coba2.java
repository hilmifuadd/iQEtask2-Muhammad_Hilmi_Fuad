public class coba2 {
    public static void main (String[]args) {
        System.out.println("mulai");
        int x=5 ;
        int a=x*2;
        for(int i=1; i<=a; i++) {
            if(i<=x) {
                for(int j=x-1; j>=i; j--){
                    System.out.print(" ");
                }
                for(int k=1; k<=i; k++) {
                    System.out.print("*");
                }
            } else{
                for(int m=a; m>=i; m--){
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }
}
