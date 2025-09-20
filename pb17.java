import java.util.Scanner;

public class pb17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n1=sc.nextInt();

        int sum=1;

        if(n1<0){
            System.out.println("Error! Factorial of a negative number doesn't exist.");
        }
        else{
            
        for(int i=n1;i>=1;i--){
           sum*=i;
           }
        System.out.println(sum);   
        }
}

}
