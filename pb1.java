import java.util.Scanner;

public class pb1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();

        if(n%2==0){
            System.out.print(n+" is even");
        }
        else{
            System.out.print(n+" is odd");
        }
        
    }
}
