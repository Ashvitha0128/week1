import java.util.*;
public class pb8 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     System.out.print("enter the age:");
     int age=sc.nextInt();
     System.out.print("enter the gender:");
     int gender=sc.nextInt();
     if((gender==2)&&(age<25)){
        System.out.println("group1");
     }
     else if((gender==1)&&(age<25)){
        System.out.println("group2");
     }
     else if((gender==2)&&(age>=25)&&(age<45)){
        System.out.println("group3");
     }
     else if((gender==1)&&(age>=25)&&(age<45)){
        System.out.println("group4");
     }
     else if((gender==1||gender==2 && age>=45)){
        System.out.println("group5");
     }
     else{
        System.out.println("invalid");
     }
   } 
}
