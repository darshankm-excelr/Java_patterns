import java.util.Scanner;
class Leap{
	public static void main(String [] args){
	Scanner sc =new Scanner(System.in);
    System.out.println("pls enter dates");
	int dd=sc.nextInt();
    int mm=sc.nextInt();
    int yy=sc.nextInt();
	if(dd>31 ||dd<1 ||mm>12||mm<1||yy<1){
	System.out.println("not valid");
	}
    else if((mm==4||mm==6||mm==9||mm==11)&& dd>30){
       System.out.println("not valid");  
    }
    else if(mm==2 && dd>29){
        System.out.println("not valid");
    }
    else if((yy%4==0 ||yy%400==0 ||yy%100!=0)==false && mm==2 &&dd>28){
        System.out.println("not valid");
    }
	else{
	System .out.println("valid date");
	}
	}
}