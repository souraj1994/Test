import java.util.Scanner;

public class loops {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter number");
		System.out.printf("%n");
		int num=sc.nextInt();
		System.out.printf("%n");
		for(int i=1;i<10;i++){
			if(i==num){
				continue;
			}
			if(i==5){
				break;
			}
			System.out.print(i);
		}
		sc.close();
	}

}
