import java.io.IOException;

/**
 * Created by ljhansi on 5/18/16.
 */
import java.io.*;
public class Isosceles {
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
