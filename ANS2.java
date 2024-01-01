import java.util.Scanner;
public class ANS2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number for its table : ");
        int n=sc.nextInt();

        for(int i=n;i<=10*n;i+=n)
        {
            System.out.println(i);
        }

    }


}
