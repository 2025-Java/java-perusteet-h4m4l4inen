package viikko1;

public class TimesTable {
    public static String table(int n) {
        // TODO
        for (int i = 1; i <= 10; i++) {
            return(n + " * " + i +" = " + n*i /n);
        }
        return null;
    }

    public static void main(String[] args) {
        String kerto = table(2);
        System.out.println(kerto);
} 
/*en tajuu, for-loop ei toimi mut en osaa korjata sitä*/
}
/*Metodi public static String table(int n) palauttaa n:n kertotaulun 1..10, 
rivit muodossa n x i = tulos ja jokaisen rivin lopussa \n.*/