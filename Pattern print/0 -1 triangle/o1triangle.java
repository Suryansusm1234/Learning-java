public class o1triangle {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 5 ; i++){
            int a = 0 ;
            for(int j = 1 ; j <= i ; j++){
                if((i %2 == 0 && j %2 == 0) ||(i %2 != 0 && j %2 != 0)){
                    a = 1 ;
                }
                else a =0 ;
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}