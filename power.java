import java.util.Scanner;

class power{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        System.out.println("Enter the exponent value: ");
        int e = scan.nextInt();
        int power = (int)Math.pow(n,e);
        System.out.println(power);
    }
}