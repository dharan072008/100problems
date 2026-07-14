import java.util.Scanner;
class factorial{
    
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = scan.nextInt();
    int fact = 1;
    if(n==0){
        System.out.println(fact);
    }
    else{
        for(int i = n; i>0; i--){
            fact = fact * i;
        }
        
        System.out.println(fact);
    }

}
}