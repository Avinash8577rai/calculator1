import java.util.Scanner;
class Calculator{

	public static int divide(int a,int b){
		return a/b;
	}


	public static void main(String[] agrs){
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enetr nuber for addition");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println(divide(a,b));
}}
