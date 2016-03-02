import java.util.Scanner;
public class Decode {
public static void main(String[] args) {
		
		String t1,t2;
		char chrt;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter text : ");
		t1=scanner.nextLine();
		t2=t1.toUpperCase();
		
		for(int i=t2.length()-1;i>=0;i--)
		{
			chrt=t2.charAt(i);
			
			if(chrt=='E'){
				chrt='R';
			}
			else if(chrt=='R'){
				chrt='W';
			}
			else if(chrt=='W'){
				chrt='E';
			}
			System.out.print(chrt);
		}
	}
}