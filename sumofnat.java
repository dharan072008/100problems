import java.util.Scanner;
public static void main(String args[])
{
    int sum = 0;
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    for(int i=1;i<=n;i++){
        sum = sum + i;
    }
    System.out.println(sum);
}