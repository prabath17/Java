import java.util.Random;
class randomoperation{
public static void main(String args[]){
Random random=new Random();
int a=random.nextInt(100);
int b=(int)(Math.random()*100);
System.out.println("a is :"+a);
System.out.println("b is :"+b);
System.out.println("a==b is " +(a==b) );
System.out.println("a!=b is " +(a!=b) );
System.out.println("a>=b is " +(a>=b) );
System.out.println("a<=b is " +(a<=b) );
System.out.println("a>b is " +(a>b) );
System.out.println("a<b is " +(a<b) );

}
}
