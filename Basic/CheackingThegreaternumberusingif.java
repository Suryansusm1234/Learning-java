import java.util.Scanner;
public class CheackingThegreaternumberusingif {
    public static void main(String args []){
        int a , b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number ");
        a = sc.nextInt();
        System.out.print("Enter The second Number ");
        b = sc.nextInt();
        if (a>b){
            System.out.println("The 1st number is greater than the second Number");
        }
        else if (b >a) {
            System.out.println("The second Number is greater Than the first One");
        }
        else{
            System.out.println("Both numbers are equal");
        }
        sc.close();
    }
}
