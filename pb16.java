import java.util.Scanner;

public class pb16 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.print("enter the starting number:");
    int n1=sc.nextInt();
    System.out.print("enter the ending number:");
    int n2=sc.nextInt();
      
    int sum=0;
    int count=0;
    for(int i=n1;i<=n2;i++){
        if(i%2==0){
            sum+=i;
        }
        else{
            count+=i;
        }
       
    }
    System.out.println(sum);
    System.out.println(count);
}
}
