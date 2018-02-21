package projecteuler.euler003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
  public static void main(String[] args) {
    /*
     * https://www.hackerrank.com/contests/projecteuler/challenges/euler003
     */

    FastReader fr = new FastReader();
    int t = fr.nextInt();
    for (int ti = 0; ti < t; ti++) {
      long n = fr.nextLong();
      System.out.println(getResult2(n));
    }
  }

  public static long getResult(long n) {

    long max = 0;
    long curr = n;
    long currPrime = 2;
    while (max <= curr) {
      if (curr % currPrime == 0) {
        curr /= currPrime;
        currPrime = 2;
      } else {
        currPrime = getNextPrime(currPrime);
//        currPrime = Long.parseLong(new BigInteger(String.valueOf(currPrime)).nextProbablePrime().toString());
      }
      max = Math.max(max, currPrime);
    }
    return max;
  }

  private static long getNextPrime(long n) {
    long nextPrime = n + 2;
    while(!isPrime(nextPrime)){
      nextPrime++;
    }

    return nextPrime;
  }
  
  public static boolean isPrime(long number) {

    for (long divisor = 2; divisor <= Math.sqrt(number); divisor++) {
        if (number % divisor == 0) {
            return false;
        }
    }

    return true;
}

  public static long getResult2(long n) {
    
    long curr = n;
    long res = 0;
    while (curr % 2 == 0) {
      curr /= 2;
      
      if (curr == 1)
        return 2;
    }
    
//    curr = n;
    long i = 3;
    for (; i <= Math.sqrt(curr); i += 2) {
     
      while (curr % i == 0) {
        curr /= i;
        res = i;
      }
    }
    
    if (curr > 2) {
      return curr;
    }else {
      return res;
    }
    
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