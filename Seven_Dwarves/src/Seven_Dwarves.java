import java.util.Scanner;
public class Seven_Dwarves {
public static void main(String[] args) {

int dwv1,dwv2,dwv3,dwv4,dwv5,dwv6,dwv7,dwv8,dwv9,sum;
Scanner scan = new Scanner(System.in);
System.out.print("Enter Number 1 : ");
dwv1 = scan.nextInt();
System.out.print("Enter Number 2 : ");
dwv2 = scan.nextInt();
System.out.print("Enter Number 3 : ");
dwv3 = scan.nextInt();
System.out.print("Enter Number 4 : ");
dwv4 = scan.nextInt();
System.out.print("Enter Number 5 : ");
dwv5 = scan.nextInt();
System.out.print("Enter Number 6 : ");
dwv6 = scan.nextInt();
System.out.print("Enter Number 7 : ");
dwv7 = scan.nextInt();
System.out.print("Enter Number 8 : ");
dwv8 = scan.nextInt();
System.out.print("Enter Number 9 : ");
dwv9 = scan.nextInt();
sum = dwv1 + dwv2 + dwv3 + dwv4 + dwv5 + dwv6 + dwv7 + dwv8 + dwv9;
if(sum-(dwv9+dwv8)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv3+"\n"+dwv4+"\n"
+dwv5+"\n"+dwv6+"\n"+dwv7);
}else if(sum-(dwv9+dwv7)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv3+"\n"+dwv4+"\n"
+dwv5+"\n"+dwv6+"\n"+dwv8);
}else if(sum-(dwv9+dwv6)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv3+"\n"+dwv4+"\n"
+dwv5+"\n"+dwv7+"\n"+dwv8);
}else if(sum-(dwv9+dwv5)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv3+"\n"+dwv4+"\n"
+dwv6+"\n"+dwv7+"\n"+dwv8);
}else if(sum-(dwv9+dwv4)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv3+"\n"+dwv5+"\n"
+dwv6+"\n"+dwv7+"\n"+dwv8);
}else if(sum-(dwv9+dwv3)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv4+"\n"+dwv5+"\n"
+dwv6+"\n"+dwv7+"\n"+dwv8);
}else if(sum-(dwv9+dwv2)==100){
System.out.println(dwv1+"\n"
+dwv3+"\n"+dwv4+"\n"+dwv5+"\n"
+dwv6+"\n"+dwv7+"\n"+dwv8);
}else if(sum-(dwv9+dwv1)==100){
System.out.println(dwv2+"\n"
+dwv3+"\n"+dwv4+"\n"+dwv5+"\n"
+dwv6+"\n"+dwv7+"\n"+dwv8);
}else if(sum-(dwv8+dwv7)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv3+"\n"+dwv4+"\n"
+dwv5+"\n"+dwv6+"\n"+dwv9);
}else if(sum-(dwv8+dwv6)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv3+"\n"+dwv4+"\n"
+dwv5+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv8+dwv5)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv3+"\n"+dwv4+"\n"
+dwv6+"\n"+dwv7+"\n"+dwv9);
}else if(sum-(dwv8+dwv4)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv3+"\n"+dwv5+"\n"
+dwv6+"\n"+dwv7+"\n"+dwv9);
}else if(sum-(dwv8+dwv3)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv4+"\n"+dwv5+"\n"
+dwv6+"\n"+dwv7+"\n"+dwv9);
}else if(sum-(dwv8+dwv2)==100){
System.out.println(dwv1+"\n"
+dwv3+"\n"+dwv4+"\n"+dwv5+"\n"+dwv6+"\n"
+dwv7+"\n"+dwv9);
}else if(sum-(dwv8+dwv1)==100){
System.out.println(dwv2+"\n"
+dwv3+"\n"+dwv4+"\n"+dwv5+"\n"
+dwv6+"\n"+dwv7+"\n"+dwv9);
}else if(sum-(dwv7+dwv6)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv3+"\n"+dwv4+"\n"
+dwv5+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv7+dwv5)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv3+"\n"+dwv4+"\n"
+dwv6+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv7+dwv4)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv3+"\n"+dwv6+"\n"
+dwv7+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv7+dwv3)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv4+"\n"+dwv5+"\n"
+dwv6+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv7+dwv2)==100){
System.out.println(dwv1+"\n"
+dwv3+"\n"+dwv4+"\n"+dwv5+"\n"
+dwv6+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv7+dwv1)==100){
System.out.println(dwv2+"\n"
+dwv3+"\n"+dwv4+"\n"+dwv5+"\n"
+dwv6+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv6+dwv5)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv3+"\n"+dwv4+"\n"
+dwv7+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv6+dwv4)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv3+"\n"+dwv5+"\n"
+dwv7+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv6+dwv3)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv4+"\n"+dwv6+"\n"
+dwv7+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv6+dwv2)==100){
System.out.println(dwv1+"\n"
+dwv3+"\n"+dwv4+"\n"+dwv5+"\n"
+dwv7+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv6+dwv1)==100){
System.out.println(dwv2+"\n"
+dwv3+"\n"+dwv4+"\n"+dwv5+"\n"
+dwv7+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv5+dwv4)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv3+"\n"+dwv6+"\n"
+dwv7+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv5+dwv3)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv4+"\n"+dwv6+"\n"
+dwv7+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv5+dwv2)==100){
System.out.println(dwv1+"\n"
+dwv3+"\n"+dwv4+"\n"+dwv6+"\n"
+dwv7+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv5+dwv1)==100){
System.out.println(dwv2+"\n"
+dwv3+"\n"+dwv4+"\n"+dwv6+"\n"
+dwv7+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv4+dwv3)==100){
System.out.println(dwv1+"\n"
+dwv2+"\n"+dwv5+"\n"+dwv6+"\n"
+dwv7+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv4+dwv2)==100){
System.out.println(dwv1+"\n"
+dwv3+"\n"+dwv5+"\n"+dwv6+"\n"
+dwv7+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv4+dwv1)==100){
System.out.println(dwv2+"\n"
+dwv3+"\n"+dwv5+"\n"+dwv6+"\n"
+dwv7+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv3+dwv2)==100){
System.out.println(dwv1+"\n"
+dwv4+"\n"+dwv5+"\n"+dwv6+"\n"
+dwv7+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv3+dwv1)==100){
System.out.println(dwv2+"\n"
+dwv4+"\n"+dwv5+"\n"+dwv6+"\n"
+dwv7+"\n"+dwv8+"\n"+dwv9);
}else if(sum-(dwv2+dwv1)==100){
System.out.println(dwv3+"\n"
+dwv4+"\n"+dwv5+"\n"+dwv6+"\n"
+dwv7+"\n"+dwv8+"\n"+dwv9);
}
else{
System.out.println("Error");
}
}
}
