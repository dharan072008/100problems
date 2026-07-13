import java.util.Scanner;
class fibo_n{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of terms to be printed: ");
        int n = scan.nextInt();

        int a = 0, b = 1;

        System.out.println("The Fibonacci Series is : ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " , ");

            int c = a + b;
            a = b;
            b = c;
        }
    }
}