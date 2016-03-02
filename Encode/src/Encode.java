import java.util.Scanner;
public class Encode {
	
	public static void main(String[] args) {
		
	String text1,text2;
	char charactor1;
		
	Scanner scaner = new Scanner(System.in);
	System.out.print("Enter text : ");
	text1=scaner.nextLine();
	text2=text1.toUpperCase();
	
	for(int i=text2.length()-1;i>=0;i--)
	{
		charactor1=text2.charAt(i);
		
		if(charactor1=='R'){
			charactor1='E';
		}
		else if(charactor1=='W'){
			charactor1='R';
		}
		else if(charactor1=='E'){
			charactor1='W';
		}
		System.out.print(charactor1);
	}
  }
}
