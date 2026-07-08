import java.util.Scanner;

class arms{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        int arm = 0;
        int rem;
        int len = String.valueOf(n).length();
        int original = n;

        while(n>0){
            rem = n%10;
            arm = arm + (int)Math.pow(rem, len);
            n = n/10;
        }
        if(original == arm){
            System.out.println("It is an armstrong number");
        }
        else{
            System.out.println("It is not an armstrong number");
        }
        scan.close();
    }
}