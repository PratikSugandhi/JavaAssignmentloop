import java.util.Scanner;

public class ANS5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci series : ");
        int n=sc.nextInt();
        int temp,a=0,b=1;

        System.out.print(a +" "+b);
        for(int i=1;i<=n-2;i++)
        {
            temp=b;
            b=a+b;
            a=temp;
            System.out.print(" "+ b);
        }


    }
}
