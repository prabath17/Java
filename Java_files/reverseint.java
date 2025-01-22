import java.util.Scanner;
class reverseint{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the integer :");
int a=sc.nextInt();
int result=0;
while(a>0){
int rem=a%10;
result=result*10+rem;
a=a/10;
}
System.out.println("the result is :"+result);
}
}
