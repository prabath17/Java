import java.util.Scanner;
class ternaryoperator{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number:");
int n=sc.nextInt();
String result= n%2==0 ? "the given number is even": "the given number is odd";
System.out.println(result);
}
}

