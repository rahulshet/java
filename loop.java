import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        //printing 10 multiple of 2
        // for(int i=1;i<=10;i++){
        //     System.out.println("2 * "+i+" = "+2*i);
        // }
        //printing prime number
        boolean isprime = true;
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        if(num <=1){
            isprime = false;
        }
        for(int i = 2; i<num; i++){
            if(num%i == 0){
                isprime = false;
                System.out.println(isprime);
                break;
            }
        }
        sc.close();
    }
    
}
