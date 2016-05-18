/**
 * Created by ljhansi on 5/18/16.
 */
import java.io.*;
public class Diamond {
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k=1;
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--)
        {
            for(int j=1;j<=k;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            k++;
        }
    }
}
