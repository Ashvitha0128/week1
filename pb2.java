import java.util.Scanner;
public class pb2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();

        if(n<0){
           System.out.println(n+" is negative");
        }
        else{
            System.out.println(n+" is positive");
        }
    }
}
