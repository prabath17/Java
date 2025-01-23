import java.util.Scanner;
class primeno{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n =sc.nextInt();
int count=0;
for(int i=2;i<=n;i++){
if(n%i==0){
count=count+1;
}
}
if(count==1)
{
System.out.println(" the given number is prime");
}
else{
System.out.println("the given number is not prime");
}
}
}

