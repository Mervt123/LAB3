import java.util.Scanner;

public class OOP6 {
    public static void main(String[] args) {
     int x,d;
     String season;
        System.out.println("enter summery...");
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        System.out.println("enter day...");
        d=in.nextInt();
     if(x==1||x==2||x==3){season="winter";System.out.println(season);}
     else if (x==4||x==5||x==6) {season="spring";System.out.println(season);}
     else if (x==7||x==8||x==9) {season="summer";System.out.println(season);}
     else if (x==10||x==11||x==12) {season="fall";System.out.println(season);}
     if(x==3||d>=21)
     {if(season == "winter"){season="spring";System.out.println(season);}
         else if (season=="spring") {season="summer";System.out.println(season);}
         else if (season=="summer") {season="fall";System.out.println(season);}
         else {season="winter";System.out.println(season);}}}}
