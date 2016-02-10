import java.util.Scanner;
public class Trik {

	public static void main(String[] args) {
		
		int Left=1,Cent=0,Right=0,temp,i;
		String swap;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Value : ");
		swap = scan.next();
		for(i=0;i<swap.length();i++){
		if(swap.charAt(i) == 'A' || swap.charAt(i) == 'a'){
		temp=Left;
		Left=Cent;
		Cent=temp;
		}
		
		else if(swap.charAt(i) == 'B' || swap.charAt(i) == 'b')
		{
		temp=Cent;
		Cent=Right;
		Right=temp;
		}
		
		else
		{
		temp=Left;
		Left=Right;
		Right=temp;
		}
		}
		if(Left == 1) System.out.println("COIN IS In LEFT GLASS : ");
		else if(Cent == 1) System.out.println("COIN IS In Center GLASS :");
		else System.out.println("COIN IS In Right GLASS :");
	}

}
