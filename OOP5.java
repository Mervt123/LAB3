import java.util.Scanner;

public class OOP5 {
    public static void main(String[] args) {
        //Q101
        Scanner in=new Scanner(System.in);
        System.out.println("choose the month^_^...");
        System.out.println("1-january   2-february   3-march");
        System.out.println("4-april     5-may        6-june  ");
        System.out.println("7-july      8-august     9-september");
        System.out.println("10-october  11=novamber  12-desamber");
        int m=in.nextInt();
        switch (m){
            case 1: if (m==1){System.out.println("31");}break;
            case 2: if (m==2){System.out.println("29");}break;
            case 3: if (m==3){System.out.println(31);}break;
            case 4: if (m==4){System.out.println(30);}break;
            case 5: if (m==5){System.out.println(31);}break;
            case 6: if (m==6){System.out.println(30);}break;
            case 7: if (m==7){System.out.println(31);}break;
            case 8: if (m==8){System.out.println(31);}break;
            case 9: if (m==9){System.out.println(30);}break;
            case 10: if (m==10){System.out.println(31);}break;
            case 11: if (m==11){System.out.println(30);}break;
            case 12: if (m==12){System.out.println(31);}break;
        }

    }
}
