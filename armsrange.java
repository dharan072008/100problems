import java.util.Scanner;
class Armsrange{


public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("ENter the starting number: ");
    int start = scan.nextInt();
    System.out.println("Enter the ending number: ");
    int end = scan.nextInt();
    

    for(int i = start;i<=end;i++){
        int num = i;
        int original = i;
        int arm = 0;
        int rem = 0;
        int len = String.valueOf(num).length();

        while(num > 0){
        rem = num % 10;
        arm = arm + (int)Math.pow(rem,len);
        num = num/10;
        }

        if(arm == original){
            System.out.println(original);
        }

    }

}
}