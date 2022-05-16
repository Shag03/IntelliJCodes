import java.util.*;
public class fact{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the no. to find factorial:");
     int num = sc.nextInt();
     factcalc(num);
    }
    public static void factcalc(int num)
    {
        int f=1;
        for(int i=num; i>0; i--)
        {
            f*=i;
        }
    
    System.out.println("Factorial of the no is: " + f);
}
}
