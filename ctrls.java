import java.util.Scanner;
public class ctrls{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("name :");
        String name =  sc.nextLine();
        
        System.out.println(name);
        sc.close();
    }
}