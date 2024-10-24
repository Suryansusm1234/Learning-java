import java.util.Scanner;
public class Printingtableofarange {
    public static void main(String[] args) {
        int start,end;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the starting point of the range ");
        start = kb.nextInt();
        System.out.print("Enter the Ending point of the range ");
        end = kb.nextInt();
        for(int i=start;i<=end;){
            for(int j=1;j<=10;j++){
                if(i != end){
                System.out.print(i+"*"+j+"="+i*j+"\t\t"+(i+1)+"*"+j+"="+(i +1)*j+"\t\t"+(i+2)+"*"+j+"="+(i +2)*j);
                System.out.print("\n");}
                else{
                    System.out.print(i+"*"+j+"="+i*j);
                    System.out.print("\n");}
        }
        System.out.print("\n");
        i +=3;
    }
}
}
