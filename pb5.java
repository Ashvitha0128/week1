import java.util.Scanner;

public class pb5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting value:");
        float n1=sc.nextFloat();
        System.out.print("Enter the ending value:");
        float n2=sc.nextFloat();
        float n3=n2-n1;
        int milage=(int)(n3*25);
        System.out.println(milage);
    }
}
