import java.util.Scanner;
public class pb4 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number:");
    int n=sc.nextInt();
    int a=n/365;
    System.out.println("Year:"+a);
    int b=(n%365)/30;
    System.out.println("Month:"+b);
    int c=(n%365)%30;
    System.out.println("Days:"+c);
  }  
}