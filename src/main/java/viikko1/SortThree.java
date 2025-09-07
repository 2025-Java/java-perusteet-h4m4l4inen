package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        // TODO
        int max = Math.max(a, Math.max(b,c));
        int min = Math.min(a, Math.min(b,c));
        int mid = a+b+c-max-min;
        
        return null;
    }
    public static void main(String[] args) {
        String jono = ascending(1, 2, 3);
        System.out.println(jono);
    } /*en ymmärtäny */
}
/*Metodi public static String ascending(int a, int b, int c) 
palauttaa luvut nousevassa järjestyksessä 
muodossa a,b,c (ei välilyöntejä).*/