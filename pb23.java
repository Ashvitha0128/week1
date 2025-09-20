import java.util.Scanner;

public class pb23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        int sum=0;

        for(int i=1;i<=n/2;i++){

            if(n%i==0){
                sum+=i;
            }
        }
        
        if(sum==n&&sum!=0){
            System.out.println("perfect number");
        }
        else{
            System.out.println("not prefect number");
        }


}
}