import java.util.Scanner;

public class OOP4 {
    public static void main(String[] args) {
        //Q6
        Scanner input=new Scanner(System.in);
        System.out.println("enter 3 number ^_^.....");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        if(a>b&&b>c) {System.out.println(a+","+b+","+c);}
        if (a>c&&c>b) {System.out.println(a+","+c+","+b);}
        if (b>a&&a>c) {System.out.println(b+","+a+","+c);}
        if (b>c&&c>a) {System.out.println(b+","+c+","+a);}
        if (c>a&&a>b) {System.out.println(c+","+a+","+b);}
        if (c>b&&b>a) {System.out.println(c+","+b+","+a);}
    }
}
