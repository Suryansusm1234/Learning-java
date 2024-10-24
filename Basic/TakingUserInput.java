import java.util.Scanner; 
public class TakingUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The first Number:-");
        int num1 = sc.nextInt();
        System.out.print("Enter The second Number:-");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        System.out.println("The sum of Two number was found to be:-"+sum);
    }
}
