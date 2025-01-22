import java.util.Scanner;
class sumofnaturalno{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the nth natural number");
int a=sc.nextInt();
int result=(a*(a+1))/2;
System.out.println("the result is :" +result);
}
}