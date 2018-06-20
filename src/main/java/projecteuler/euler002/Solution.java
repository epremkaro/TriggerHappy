package projecteuler.euler002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
  public static void main(String[] args) {
    /*
     * Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be
     * named Solution.
     */
    FastReader fr = new FastReader();
    int t = fr.nextInt();
    for (int ti = 0; ti < t; ti++) {
      System.out.println(getResult(fr.nextLong()));
    }
  }

  public static long getResult(long n) {
    long sum = 0;
    long prev = 1;
    long curr = 2;
    while (curr < n) {
      if (curr % 2 == 0)
        sum += curr;
      curr += prev;
      prev = curr - prev;
      
    }
    return sum;
  }

  public static void println(String msg) {
    if (true)
      System.out.println(msg);
  }

  public static void println(long msg) {
    if (true)
      System.out.println(msg);
  }

  /* ================================================================== */
  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
      br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt() {
      return Integer.parseInt(next());
    }

    long nextLong() {
      return Long.parseLong(next());
    }

    double nextDouble() {
      return Double.parseDouble(next());
    }

    String nextLine() {
      String str = "";
      try {
        str = br.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
      return str;
    }
  }
}