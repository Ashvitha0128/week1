import java.util.*;
public class pb12 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value:");
    int n1=sc.nextInt();
    System.out.println("enter the value:");
    int n2 =sc.nextInt();
    System.out.println("enter the value:");
    int n3=sc.nextInt();
   
    // if((n1+n2>n3)&&(n1+n3>n2)&&(n2+n3>n1)){
        if(n1==n2 && n2==n3){
            System.out.println("Equilateral Triangle");
        }
           else if((n1==n2)||(n1==n3)||(n2==n3)){
            System.out.println("Isosceles Triangle");
        }
           else{
            System.out.println("Scalene");
        }
    }    
    // else{
    //     System.out.println("Not a triangle");
    // }
   } 

