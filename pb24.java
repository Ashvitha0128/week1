import java.util.Scanner;

public class pb24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        boolean isprime=true;
        if(n<=1){
            System.out.println("false");

        }
        else {
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }
       
        }
        if(isprime==true){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
