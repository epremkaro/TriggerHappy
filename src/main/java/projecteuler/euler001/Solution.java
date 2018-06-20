package projecteuler.euler001;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      FastReader fr = new FastReader();
      int t = fr.nextInt();
      for (int ti = 0; ti < t; ti++) {
        System.out.println(getResult(fr.nextInt()));
      }
    }
    
    
    public static long getResult(int n) {
      long sum = 0;

      long mod = n / 3;
      if (n % 3 == 0)
        mod--;
      
      sum = ((mod * (mod+1)) / 2) * 3;
      
      mod = n / 5;
      if (n % 5 == 0)
        mod--;
      
      long sum5 = ((mod * (mod+1)) / 2) * 5;
      
      sum += sum5;
      
      mod = n / 15;
      if (n % 15 == 0)
        mod--;
      long sum15 = ((mod * (mod+1)) / 2) * 15;
      
      
      return sum-sum15;
    }
    
    
    public static void println(String msg) {
      if (true)
        System.out.println(msg);
    }
    
    public static void println(long msg) {
      if (true)
        System.out.println(msg);
    }


    /*==================================================================*/
static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}