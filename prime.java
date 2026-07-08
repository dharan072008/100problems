import java.util.Scanner;
public static void main(String[] args)
{
    int i;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number to check whether it is prime or not: ");
    int n = scan.nextInt();
    boolean isprime = true;

    if(n<2)
    {
        isprime = false;
    }
    else
    {
        for(i=2;i<n;i++){
            if(n%i==0){
                isprime = false;
                break;
            }
        }
    }
    String result = isprime ? "prime" : "not prime";
    System.out.println("The number "+n+" is "+result);
}