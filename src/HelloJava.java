import java.util.Scanner;

public class HelloJava {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input Number");
		System.out.printf("%n");
		int num=sc.nextInt();
		switch(num){
		case(10):System.out.print("Hello 10");break;
		case(20):System.out.print("Hello 20");break;
		default:System.out.print("Please input a valid value");
		}
		System.out.printf("%n");
		System.out.print("Congratulations");
		sc.close();

	}

}
