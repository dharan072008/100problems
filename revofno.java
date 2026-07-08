import java.util.Scanner;

class revofno {
    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to be print in reverse: ");
        int n = scan.nextInt();
    int reverse = 0;
    int rem;
    while(n>0){
        rem = n % 10 ;
        reverse = reverse * 10 + rem;
        n = n/10;
    }
        System.out.println("THE reversed no is: "+reverse);
    }
}