package Forelesning5;


import java.sql.SQLOutput;

public class DobbeltLenkedListe {

    public static void main(String[] args) {
        DobbeltLenkedListe values = new DobbeltLenkedListe();
        values.add_first(3);
        values.add_first(11);
        values.print();
    }


    static class Node {
        int value; // Verdi vi vil lagre
        Node next; // Peker til neste node eller null
        Node prev; // Peker til forrige node eller null

        Node(int value){
            this.value = value;
            this.next = null;
            this.prev = null;
        }

        Node(int value, Node prev, Node next){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    // Variabler klassen min
    Node head;      // Peker til første node i den lenkede listen
    Node tale;      // Peker til siste node i den lenkede listen
    int num_values; // Antall verdier i den lenkede liste

    /**
     * Konstruktor
     */
    DobbeltLenkedListe() {
        this.head = null;
        this.tale = null;
        this.num_values = 0;
    }

    public void print() {
        // Alternativ 1: for-løkke
        Node p = head;

        for(int i = 0; i < num_values; i++) {
            System.out.print(p.value);
            p = p.next;
            if (i < num_values-1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        // Alternativ 2: while-løkke
        Node q = head;
        while (q != null) {
            System.out.print(q.value + ", ");
            q = q.next;
        }
    }

    /**
     * Add funksjon som legger til ved hode-enden
     * av den dobbelte lenkede listen. Synonymer er:
     * head, front
     * @return Antall verdier til den nye noden vi har laget etter add
     */
    int add_first(int value) {
        Node p = new Node(value);

        if(head == null && tale == null) {
            head = p;
            tale = p;
            num_values += 1;
            // Vi har noder allerede
        } else {
            Node q = head;
            head = p;
            q.prev = p;
            p.next = q;
            num_values += 1;
        }
        return num_values;
    }

    /**
     * Add funksjon som legger til ved hale-enden
     * av den dobbelte lenkede listen. Synonymer er:
     * back, tail
     */
    void add_last() {

    }

    /**
     * Insert funksjon
     */
    void insert(int index, int value) {
        if (index == 0) {
            // Spesialltilfelle
        }
        if (index == num_values-1) {
            // Spesialltilfelle - add_last
        }
        Node q = new Node(value);

        // Finn de nodene vi skal sette inn p mellom
        // slik at vi får p - q - r i listen vår.
        Node r = head;
        for (int i=0; i < index; i++) {
            r = r.next;
        }
        Node p = r.prev;

        p.next = q;
        q.next = r;
        q.prev = p;
        r.prev = q;
    }
}
