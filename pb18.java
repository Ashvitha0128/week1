import java.util.*;

public class pb18 {
    public static void main(String[] args) {
        
    
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n1=sc.nextInt();

        if(n1==0){
            System.out.println("o");
        }
        else{
           while(n1>0){
                int digit=n1%10;
                System.out.println(digit+" ");
                n1=n1/10;
        }
        System.out.println();
    }
}
}