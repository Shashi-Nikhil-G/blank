import java.util.Scanner;

class FactFor{
	public static void main(String[] args){
		System.out.println("mms");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		
		int fact=1;
		for(int i=n;i>0;i--){
			fact = fact*i;
		}
		System.out.println("Factorial of "+n+" is = "+fact);
		
		System.out.println("mme");
	}
}