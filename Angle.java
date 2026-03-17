import java.util.Scanner;
class Angle{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Hour angle:");
        int hr=sc.nextInt();
        System.out.println("enter the min angle:");
        int min=sc.nextInt();
         double minitAngle=min*6;
       double  HourAngle= hr*30+min*0.5;
       double angle=minitAngle-HourAngle;
       if(angle<0)
            angle=angle*-1;
        else if(angle>180)
            angle=360-angle;
       System.out.println("least angle is"+angle);

    }
}