package Forelesning4;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(2);
    }

    // En funksjon som kjører "tower of Hanoi" ved hjelp av rekursive kall
    static void towerOfHanoi(int num_pieces) {
        hanoiMove(num_pieces,'A','C','B');
    }

    /**
     * Utfører et rekursivt flytt i "Tower of Hanoi"
     * @param piece_number Brikken vi skal flytte på
     * @param from Stikken vi flytter fra => "A"
     * @param to Stikken vi flytter til => "C"
     * @param helper Hjelpestikken => "B"
     */
     static void hanoiMove(int piece_number, char from, char to, char helper) {
         // Vi slutter rekursjon når vi har kommet til øverste brikke
         if(piece_number < 0) {
             return;
         }

        // Punkt 1: FLytt alt fra stikke C over til stikke B
        //          Bruk stikke A som hjelpestikke
         hanoiMove(piece_number-1, from, helper, to);

        // Punkt 2: Flytt øverste brikke fra A til C
        //          Her trenger vi ingen hjelpestikke => flytter bare en brikke
         System.out.println("Flytter " + piece_number + ": " + from + " - " + to);

        // Punkt 3: Flytt alt på stikk B (fra punkt 1) over på stikke C
        //          Bruk stikke A som hjelpestikke
         hanoiMove(piece_number-1, helper, to, from);
    }
}
