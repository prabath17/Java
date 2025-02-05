import java.util.Scanner;
class factorial{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=1;
int result=1;
while(i<=n)
{
result=result*i;
i++;
}
System.out.println("the result is "+result);
}
}