/**
 * Created by ljhansi on 5/18/16.
 */
import java.io.*;
public class FizzBuzz {
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        FizzBuzz fb = new FizzBuzz();
        fb.fizzBuzz(n);
    }
    private void fizzBuzz(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i%3 == 0 && i%5 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i%3 == 0)
            {
                System.out.println("Fizz");
            }
            else if(i%5 == 0)
            {
                System.out.println("Buzz");
            }
            else
                System.out.println(i);
        }
    }
}
