import java.io.*;

/**
 * Created by ljhansi on 5/18/16.
 */
public class PrimeFac {
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PrimeFac pf = new PrimeFac();
        pf.generate(n);
    }
    private void generate(int n)
    {
        int i,c=0;
        for(i=n;i>=1;i--)
        {
            c=0;
            for(int j=i;j>=1;j--)
            {
                if (i % j == 0) {
                    c = c + 1;
                }
            }
            if(c==2 && n%i == 0)
            {
                System.out.println(i);
            }
        }
    }
}
