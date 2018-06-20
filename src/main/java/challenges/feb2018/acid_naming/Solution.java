package challenges.feb2018.acid_naming;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String acidNaming(String acid_name) {
        // Complete this function
      Map<Integer, String> results = new HashMap<>();
      results.put(1, "non-metal acid");
      results.put(2, "polyatomic acid");
      results.put(3, "not an acid");
      
      if (acid_name.startsWith("hydro") && acid_name.endsWith("ic")) {
          return results.get(1);
      }else if (acid_name.endsWith("ic")) {
        return results.get(2);
      }else
        return results.get(3);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String acid_name = in.next();
            String result = acidNaming(acid_name);
            System.out.println(result);
        }
        in.close();
    }
}
