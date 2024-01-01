import java.util.Scanner;

public class ANS4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int temp,r,sum=0;
        temp=n;
        while(n!=0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("The given number is a Palindrome number");
        }
        else{
            System.out.println("The given number is not  a Palindrome number");
        }

    }
}
