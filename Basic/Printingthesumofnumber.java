import java.util.Scanner;
public class Printingthesumofnumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Enter The range of Natural number Whose sum You have to find ");
        n = kb.nextInt();
        for(int i = 1 ; i<=n;i++){
            sum += i;
        }
        System.out.println("Sum of first "+n+" natural number is "+sum);
        kb.close();
    }
}
