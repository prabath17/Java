import java.util.Scanner;
class simpleinterest{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("ENTER THE PRINCIPLE AMOUNT :");
int p=sc.nextInt();
System.out.println("ENTER THE YEAR :");
int n=sc.nextInt();
System.out.println("ENTER THE INTEREST :");
int r=sc.nextInt();
int result=(p*n*r)/100;
System.out.println( "THE FINAL AMOUNT IS :"+result);
}
}
