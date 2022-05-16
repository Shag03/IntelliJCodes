import java.util.Scanner;

public class rev_a_no 
{ 
   public static void main(String args[]) {
       //main method
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no. to reverse:");
       int num = sc.nextInt();
       int rev=0;
       while(num !=0){
           int rem = num%10;
           rev = rev*10 + rem;
           num = num/10;
       } 
       System.out.println("Reverse is:" + rev);
   }
    
}
