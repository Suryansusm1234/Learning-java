import java.util.Scanner;
public class Halfpyramid {
    public static void main(String[] args) {
        int n ;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number of rows");
        n = kb.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
        }
        System.out.print("\n");
    }
    kb.close();
}
}
