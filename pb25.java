import java.util.Scanner;

public class pb25 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();

        int a=(int)Math.sqrt(n);

        if(a*a==n){
            System.out.println("prefect square");
        }
        else{
            System.out.println("not prefect square");
        }
}
}