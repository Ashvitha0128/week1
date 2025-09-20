import java.util.Scanner;

public class pb22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        int a=n;

        if(n==0){
            sum=1;
        }
        else{
            while(a!=0){
                sum+=a%10;
                a=a/10;
            }
        }
        

        if(n%sum==0){
            System.out.println("harshed number");
        }
        else{
            System.out.println("not harshed number");
        }
}
}
