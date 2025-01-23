import java.util.Scanner;
class ageclassification{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the age :");
int age=sc.nextInt();
if(0<=age && 12>=age){
System.out.println("child");
}
else if(13<=age && 19>=age){
System.out.println("Teenagers");
}
else if(20<=age && 64>=age){
System.out.println("adult");
}
else{
System.out.println("Senior");
}
}
}

