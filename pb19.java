import java.util.Scanner;

public class pb19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the starting number:");
        int n1=sc.nextInt();
        System.out.print("enter the second number:");
        int n2=sc.nextInt();
        int count=0;
        for(int i=n1;i<=n2;i++){
            if(i%3==0||i%5==0){
                count+=i;
            }    
        }
        System.out.println(count);

        
    }
}
