import java.util.Scanner;
public class Patter6TT {
    public static void main(String[] args)
    {
        System.out.println("Name:LAVANYA");
        System.out.println("SAP ID:1000014237\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int rows = sc.nextInt();
        for (int i= rows-1; i>= 0; i--)
        {
            for (int j=i; j>=0; j--)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
        for (int i=0; i<= rows-1; i++)
        {
            for(int j=i; j >= 0;j--)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
