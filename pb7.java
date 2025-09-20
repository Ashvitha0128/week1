import java.util.Scanner;

public class pb7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the  first number:");
        int n1=sc.nextInt();
        System.out.print("enter the second number:");
        int n2=sc.nextInt();
        System.out.print("enter the third number:");
        int n3=sc.nextInt();
        if((n1<n2)&&(n3<n2)&&(n1<n3)){
            
            System.out.println(n2+" is maximum");
            System.out.println(n1+" is minimum");
       
        }
        else if((n2<n1)&&(n3<n1)&&(n3<n2)){
           System.out.println(n1+" is maximum");
            System.out.println(n3+" is minimum"); 
        }
        else if((n1<n3)&&(n2<n3)&&(n1<n2)){
            System.out.println(n3+" is maximum");
            System.out.println(n1+" is minimum"); 
        }
}
}
