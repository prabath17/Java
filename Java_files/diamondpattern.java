import java.util.Scanner;
class diamondpattern{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
        for (int a = 0; a < n; a++) {
            for (int i = 0; i < n - a - 1; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * a + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a = n-1; a>= 0; a--) {
            for (int i = 0; i < n - a - 1; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * a + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
}
}