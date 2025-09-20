import java.util.*;
public class pb11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Age of primary applicant:");
        int a=sc.nextInt();
        System.out.println("enter the  Age of add-on card applicant:");
        int b=sc.nextInt();
        System.out.println("enter the Employment type code:");
        int c=sc.nextInt();
        System.out.println("enter the Income:");
        int d=sc.nextInt();

        if((a>=20)&&(a<60)&&(b>=18)&&(d<=300000)){
           System.out.println("yes. You are eligible for SBI credit cards");
        }
        else{
            System.out.println("No. You are not eligible for SBI credit cards");
        }

    }
}
