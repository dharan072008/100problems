import java.util.Scanner;
public static void main(String[] args)
{
    int i;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the number to check whether it is prime or not: ");
    int n = scan.nextInt();
    int count = 0;

    if(n<2)
    {
        System.out.println("The given number is not prime");
    }
    
    
        for(i=1;i<n;i++){
            if(n%i==0){
                count = count + 1;
                
            }
        }
        if(count>2){
            
            System.out.println("The given number is not prime");
        }
        else{
            System.out.println("The given number is prime");
        }
        
    
    
}