import java.util.Scanner;

class ANS1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of positive terms: ");
        int n=sc.nextInt();
        int sum=0;

        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of all natural number upto "+n+ "is "+sum);
    }
}