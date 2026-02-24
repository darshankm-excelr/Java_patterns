import java.util.Scanner;
class Divisor{
	
	public static void main(String[] args){
int count=1;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1;i<=n/2;i++){
	if(n%i==0){
	count++;
  	System.out.println("number of divisor"+"  "+count);
	}
}

}
}
	