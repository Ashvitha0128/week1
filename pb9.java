import java.util.*;
public class pb9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int n4=sc.nextInt();
        int first=Math.max(Math.max(n1, n2),Math.max(n4,n3));
        int last=Math.min(Math.min(n1,n2),Math.min(n3,n4));
        int second=Math.max(Math.min(n1,n2),Math.min(n3,n4));
        int third=Math.min(Math.max(n1,n2),Math.max(n3,n4));


        if(second>third){
            System.out.println(first+">"+second+">"+third+">"+last);
        }
        else{
             System.out.println(first+">"+third+">"+second+">"+last);
        }
    }
}
