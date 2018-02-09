package challenges.feb2018.race_against_time;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
  static long raceAgainstTime(int n, int mason_height, int[] heights, int[] prices) {
    int slider = mason_height;
    long res = n;
    
    for (int i = 0; i < n - 1; i++) {
      long delta = Math.abs(slider - heights[i]) + prices[i];
      print("i=" + i + ": " + delta);
      if (heights[i] > slider) {
        print("gr");
        res += Math.abs(heights[i] - slider) + prices[i];
        slider = heights[i];
      }else if(delta < 0) {
        res += delta;
      }
     }
      
    return res;
  }

    static long raceAgainstTime1(int n, int mason_height, int[] heights, int[] prices) {
      int startIdx = 0;
      long[] minArr = new long[n-1];
      int slider = mason_height;
      for (int i = 0; i < n - 1; i++) {
        //filling additional array, always check the min, start checking for each subset starting from the max value, on which we mush switch.
        long min = Long.MAX_VALUE;
        boolean isAdd = false;
//        for (int j = startIdx; j <= i; j++) {
          isAdd = false;
          min = Long.MAX_VALUE;
          int m = Math.abs(heights[i] - slider) + prices[i];
          print("m = " + m + ", i = " + i);
          if (heights[i] > slider) {
            print("gr");
            for (int j = startIdx; j <= i && prices[i] < 0; j++) {
              min = Long.MAX_VALUE;
              m = Math.abs(heights[j] - slider) + prices[j];
            }
            startIdx = i;
            slider = heights[i];
            isAdd = true;
          }else {
            m = Math.min(m, 1);
            if (m < 1)
              isAdd = true;
          }
          min = Math.min(m, min);
//        }
        if (isAdd)
          min++;
        minArr[i] = min + (i == 0 ? 0L : minArr[i-1]);
        print("min = " + min + ", minA = " + minArr[i]);
      }
      for (long ll : minArr) {
        print(">>>: " + String.valueOf(ll));
      }
      return minArr[n-2] + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mason_height = in.nextInt();
        int[] heights = new int[n-1];
        for(int heights_i = 0; heights_i < n-1; heights_i++){
            heights[heights_i] = in.nextInt();
        }
        int[] prices = new int[n-1];
        for(int prices_i = 0; prices_i < n-1; prices_i++){
            prices[prices_i] = in.nextInt();
        }
        long result = raceAgainstTime(n, mason_height, heights, prices);
        System.out.println(result);
        in.close();
    }
    
    static void print(String msg) {
      if (true)
        System.out.println(msg);
    }
}
