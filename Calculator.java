import java.util.Scanner;
class Calculator{
	public static int add(int a,int b){
		return a+b;
	}
	public static int subtract(int a,int b){
		return a-b;
	}
	public static int multipilcation(int a,int b){
		return a*b;
	}
	public static int divide(int a,int b){
		return a/b;
	}


	public static void main(String[] agrs){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr nuber for addition");
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		
		System.out.println(divide(a,b));
}}
