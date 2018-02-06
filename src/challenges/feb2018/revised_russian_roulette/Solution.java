package challenges.feb2018.revised_russian_roulette;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] revisedRussianRoulette(int[] doors) {
      // Complete this function
      int min = 0, max = 0;
      
      for (int i = 0; i < doors.length; i++) {
        if (doors[i] == 1) {
          max++;
          min++;
          //0 1 1 0 1 1 1 1 0 0
          if (i+1 != doors.length) {
            if (doors[i+1] == 1) {
              max++;
              i++;
            }
          }
        }
      }
      
      return new int[] {min, max};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] doors = new int[n];
        for(int doors_i = 0; doors_i < n; doors_i++){
            doors[doors_i] = in.nextInt();
        }
        int[] result = revisedRussianRoulette(doors);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
