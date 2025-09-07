package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        // TODO
        if (n>0 && n%2 == 0) {
            return "positiivinen parillinen";
        }
        else if (n>0 && n%2 !=0) {
            return "positiivinen pariton";
        }
        else if (n<0 && n%2==0){
            return "negatiivinen parillinen";
        }
        else if (n<0 && n%2 !=0){
            return "negatiivinen pariton";
        }
        else {
            return "nolla";
        }
        /*return null;*/
    }
  
    public static void main(String[] args) {
        String luku = describe(-9);
        System.out.println("Millainen annettu luku on? " + luku);
    }
}
/*Metodi public static String describe(int n) palauttaa jonkin seuraavista:

positiivinen parillinen
positiivinen pariton
negatiivinen parillinen
negatiivinen pariton
nolla*/