import java.util.Scanner;

public class OOP3 {
    public static void main(String[] args) {
//Q5
        Scanner input=new Scanner(System.in);
        System.out.println("enter number...");
        int x=input.nextInt();
        int s=input.nextInt();
        int v=input.nextInt();
        x=s;
        v=s;
        v=x;
        System.out.println(x+","+s+","+v);
    }
}
