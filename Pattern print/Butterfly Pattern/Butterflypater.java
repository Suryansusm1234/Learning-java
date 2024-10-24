import java.util.Scanner;
public class Butterflypater{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number Rows ");
        int n = sc.nextInt();
        int space1 = n-2;
        for(int i  = 1;i<=n/2;i++){
            if(i==n/2) for(int j = 1;j<=n;j++){
                System.out.print("*");
                
            }
            else{
                for(int j = 1;j<=i;j++){
                    System.out.print("*");
                }
                for(int k = space1;k>=i;k--){
                    System.out.print(" ");
                }
                space1 -=1;
                for(int l = 1; l<=i;l++){
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }System.out.println();
        //Other half of Butterfly Pattern
        for(int i = 1;i<=n/2;i++){
            if(i==1) for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            else{
                for(int j = n/2;j>=i;j--){
                    System.out.print("*");
                }
                for(int k = 1; k <= (i - 1) * 2; k++){
                    System.out.print(" ");
                }
                for(int l = n/2;l>=i;l--){
                    System.out.print("*");
                }
                
            }
            System.out.println();
        }
    }
}