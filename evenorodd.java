import java.util.Scanner;

public static void main(String agrs[])
{
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = scan.nextInt();
    if(num % 2 == 0){
        System.out.println("It is even number");
    }
    else {
        System.out.println("It is Odd number");
    }
}