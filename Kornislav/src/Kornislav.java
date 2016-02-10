import java.util.Scanner;
public class Kornislav {

	public static void main(String[] args) {
		int val1,val2,val3,val4,swap;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Value 1 : ");
		val1=scan.nextInt();
		System.out.print("Input Value 2 : ");
		val2=scan.nextInt();
		System.out.print("Input Value 3 : ");
		val3=scan.nextInt();
		System.out.print("Input Value 4 : ");
		val4=scan.nextInt();
		if(val1>val2){
			swap=val1;
		val1=val2;
		val2=swap;
		}
		if(val1>val3){
			swap=val1;
		val1=val3;
		val3=swap;
		}
		if(val1>val4){
			swap=val1;
		val1=val4;
		val4=swap;
		}
		if(val2>val3){
			swap=val2;
		val2=val3;
		val3=swap;
		}
		if(val2>val4){
			swap=val2;
		val2=val4;
		val4=swap;
		}
		if(val3>val4){
			swap=val3;
		val3=val4;
		val4=swap;
		}
		System.out.print("\nRectangle Area = : "+""+val3+""+" * "+val1+" = "+val3*val1);

	}

}
