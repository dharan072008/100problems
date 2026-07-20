import java.util.Scanner;
class factors{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scan.nextInt();
        int m = scan.nextInt();

        if(n>m){

        
        
        for(int i = 1; i<=n;i++){
            if((n%i==0)&&(m%i==0)){
                System.out.println(i);
            }
        }
        }
        else{
             
        for(int i = 1; i<=m;i++){
            if((n%i==0)&&(m%i==0)){
                System.out.println(i);
            }
        }

        }
    }
}