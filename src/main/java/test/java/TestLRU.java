package test.java;

/**
 * @author Karapet_Yepremyan on 10/15/2018
 * @project TriggerHappy
 */
public class Test {
    public static void main(String[] args) {


        LRU<String, String> cache = new LRU<>(10);

        cache.put("A", "1 letter");
        cache.put("B", "2 letter");
        cache.put("C", "3 letter");
        cache.put("D", "4 letter");
        cache.put("E", "5 letter");
        cache.put("F", "6 letter");
        cache.put("G", "7 letter");
        cache.put("H", "8 letter");
        cache.put("I", "9 letter");

        cache.keySet().stream().forEach(e -> System.out.print(e + " "));
        System.out.println("\nSize = " + cache.size());

        cache.get("F");
        cache.get("I");
        cache.get("E");
        cache.get("C");

        cache.put("A2", "12 letter");
        cache.put("B2", "22 letter");
        cache.put("C2", "32 letter");
        cache.put("D2", "42 letter");
        cache.put("E2", "52 letter");
        cache.get("F");
        cache.get("I");
        cache.get("E");
        cache.get("C");
        cache.put("F2", "62 letter");
        cache.put("G2", "72 letter");
        cache.put("H2", "82 letter");
        cache.put("I2", "92 letter");


        cache.keySet().stream().forEach(e -> System.out.print(e + " "));
        System.out.println("\nSize = " + cache.size());

        cache.get("I");
        cache.get("E");
        cache.get("H");
        cache.get("A");
        cache.get("E");
        cache.get("F");
        cache.get("F");
        cache.get("F");
        cache.get("F");
        System.out.println(cache.get("A"));
        cache.get("F");
        cache.get("I");
        cache.get("E");
        cache.get("C");
        System.out.println("");
        cache.keySet().forEach(e -> System.out.print(e + " "));
    }
}
