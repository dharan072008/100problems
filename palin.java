import java.util.Scanner;
class palin{


public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = scan.nextInt();
    int reverse = 0;
    int rem;
    int original = n;
    while(n>0){
        rem = n % 10;
        reverse = reverse * 10 + rem;
        n = n/10;
    }
    if(reverse == original){
        System.out.println("It is palindrome number");
    }
    else{
        System.out.println("It is not a palindrome number");
    }
    
}
}