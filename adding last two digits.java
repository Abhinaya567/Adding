import java.util.Scanner;
public class adding last two digits{
public static void main (String[] args){
Scanner sc = new.Scanner;
System.out.println("enter the first number");
int a = sc.nextInt();
System.out.println("enter the second number");
int b = sc.nextInt();
int dig1 = a%10;
int dig2 = b%10;
int sum = dig1+dig2;
System.out.println("adding of last two digits of given numbers" + sum );
}
}
