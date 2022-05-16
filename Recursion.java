import java.util.*;
class fact
{   //this is for recursion
    int factorial (int n)
    {
      int res;
      if(n==1)
       return 1;
      res = factorial(n-1) * n;
      return res;
    }
}

class Recursion{
//main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.:");
        int num = sc.nextInt();
        fact f=new fact();
        System.out.println("Factorial is: " + f.factorial(num));
    }
}