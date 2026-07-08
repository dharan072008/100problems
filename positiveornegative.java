
import java.util.Scanner;

public static void main(String agrs[])
{
    Scanner scan = new Scanner(System.in);
    System.out.println("ENter the number: ");
    int num  = scan.nextInt();
    if(num>0){
        System.out.println("Positive number");
    }
    else if(num<0){
        System.out.println("Negative number");
    }
    else {
        System.out.println("Zero");
    }
}