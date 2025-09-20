import java.util.Scanner;

public class pb20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int a=n;

        if(n==0){
            count=1;
        }
        else{
            while(a!=0){
                a=a/10;
                count++;
            }
        }
        System.out.println(count);
    }
}
