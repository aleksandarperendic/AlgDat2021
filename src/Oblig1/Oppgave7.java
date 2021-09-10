package Oblig1;


public class Oppgave7 {

    public static void main(String[] args) {
// ABCD - EFGH (A E B F C G D H }
        String jedan = "ABCD";
        String dva = "EFGHLLLL";
        String print = flett(jedan, dva);
        System.out.println(print);
        int proba = jedan.length()+dva.length();
        System.out.println(proba);

    }

    public static String flett(String s, String t) {
        String ut = "";
            for (int i = 0; i < s.length() || i < t.length(); i++) {
                if (i < s.length()) {
                    char test = s.charAt(i);
                    ut += test + "";
                } if (i < t.length()) {
                    char testT = t.charAt(i);
                    ut += testT + "";
                }
            }
        return ut;
    }
}
